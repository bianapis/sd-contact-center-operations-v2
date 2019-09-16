package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanControlOutputModel
 */
public class CRContactCenterAdministrativePlanControlOutputModel   {
  private String contactCenterAdministrativePlanControlActionTaskReference = null;

  private Object contactCenterAdministrativePlanControlActionTaskRecord = null;

  private String contactCenterAdministrativePlanControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Administrative Plan instance control processing service call 
   * @return contactCenterAdministrativePlanControlActionTaskReference
  **/

  public String getContactCenterAdministrativePlanControlActionTaskReference() {
    return contactCenterAdministrativePlanControlActionTaskReference;
  }

  public void setContactCenterAdministrativePlanControlActionTaskReference(String contactCenterAdministrativePlanControlActionTaskReference) {
    this.contactCenterAdministrativePlanControlActionTaskReference = contactCenterAdministrativePlanControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return contactCenterAdministrativePlanControlActionResponse
  **/

  public String getContactCenterAdministrativePlanControlActionResponse() {
    return contactCenterAdministrativePlanControlActionResponse;
  }

  public void setContactCenterAdministrativePlanControlActionResponse(String contactCenterAdministrativePlanControlActionResponse) {
    this.contactCenterAdministrativePlanControlActionResponse = contactCenterAdministrativePlanControlActionResponse;
  }


}

