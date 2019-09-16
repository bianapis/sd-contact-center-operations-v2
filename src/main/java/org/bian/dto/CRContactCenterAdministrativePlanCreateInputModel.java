package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanCreateInputModel
 */
public class CRContactCenterAdministrativePlanCreateInputModel   {
  private String contactCenterOperationsServicingSessionReference = null;

  private Object contactCenterAdministrativePlanCreateActionRecord = null;

  private String contactCenterAdministrativePlanInstanceStatus = null;

  private CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return contactCenterAdministrativePlanCreateActionRecord
  **/

  public Object getContactCenterAdministrativePlanCreateActionRecord() {
    return contactCenterAdministrativePlanCreateActionRecord;
  }

  public void setContactCenterAdministrativePlanCreateActionRecord(Object contactCenterAdministrativePlanCreateActionRecord) {
    this.contactCenterAdministrativePlanCreateActionRecord = contactCenterAdministrativePlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Contact Center Administrative Plan instance (e.g. initialised, pending, active) 
   * @return contactCenterAdministrativePlanInstanceStatus
  **/

  public String getContactCenterAdministrativePlanInstanceStatus() {
    return contactCenterAdministrativePlanInstanceStatus;
  }

  public void setContactCenterAdministrativePlanInstanceStatus(String contactCenterAdministrativePlanInstanceStatus) {
    this.contactCenterAdministrativePlanInstanceStatus = contactCenterAdministrativePlanInstanceStatus;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceRecord
   * @return contactCenterAdministrativePlanInstanceRecord
  **/

  public CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
  }


}

