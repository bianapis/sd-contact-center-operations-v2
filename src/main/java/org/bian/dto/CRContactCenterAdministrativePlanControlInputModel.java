package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanControlInputModel
 */
public class CRContactCenterAdministrativePlanControlInputModel   {
  private String contactCenterOperationsServicingSessionReference = null;

  private String contactCenterAdministrativePlanInstanceReference = null;

  private Object contactCenterAdministrativePlanControlActionTaskRecord = null;

  private CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest contactCenterAdministrativePlanControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return contactCenterAdministrativePlanControlActionTaskRecord
  **/

  public Object getContactCenterAdministrativePlanControlActionTaskRecord() {
    return contactCenterAdministrativePlanControlActionTaskRecord;
  }

  public void setContactCenterAdministrativePlanControlActionTaskRecord(Object contactCenterAdministrativePlanControlActionTaskRecord) {
    this.contactCenterAdministrativePlanControlActionTaskRecord = contactCenterAdministrativePlanControlActionTaskRecord;
  }


  /**
   * Get contactCenterAdministrativePlanControlActionRequest
   * @return contactCenterAdministrativePlanControlActionRequest
  **/

  public CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest getContactCenterAdministrativePlanControlActionRequest() {
    return contactCenterAdministrativePlanControlActionRequest;
  }

  public void setContactCenterAdministrativePlanControlActionRequest(CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest contactCenterAdministrativePlanControlActionRequest) {
    this.contactCenterAdministrativePlanControlActionRequest = contactCenterAdministrativePlanControlActionRequest;
  }


}

