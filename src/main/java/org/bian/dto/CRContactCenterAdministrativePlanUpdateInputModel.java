package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanUpdateInputModel
 */
public class CRContactCenterAdministrativePlanUpdateInputModel   {
  private String contactCenterOperationsServicingSessionReference = null;

  private String contactCenterAdministrativePlanInstanceReference = null;

  private CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private Object contactCenterAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactCenterOperationsServicingSessionReference
  **/

  public String getContactCenterOperationsServicingSessionReference() {
    return contactCenterOperationsServicingSessionReference;
  }

  public void setContactCenterOperationsServicingSessionReference(String contactCenterOperationsServicingSessionReference) {
    this.contactCenterOperationsServicingSessionReference = contactCenterOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact Center Administrative Plan instance 
   * @return contactCenterAdministrativePlanInstanceReference
  **/

  public String getContactCenterAdministrativePlanInstanceReference() {
    return contactCenterAdministrativePlanInstanceReference;
  }

  public void setContactCenterAdministrativePlanInstanceReference(String contactCenterAdministrativePlanInstanceReference) {
    this.contactCenterAdministrativePlanInstanceReference = contactCenterAdministrativePlanInstanceReference;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceRecord
   * @return contactCenterAdministrativePlanInstanceRecord
  **/

  public CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return contactCenterAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getContactCenterAdministrativePlanUpdateActionTaskRecord() {
    return contactCenterAdministrativePlanUpdateActionTaskRecord;
  }

  public void setContactCenterAdministrativePlanUpdateActionTaskRecord(Object contactCenterAdministrativePlanUpdateActionTaskRecord) {
    this.contactCenterAdministrativePlanUpdateActionTaskRecord = contactCenterAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

