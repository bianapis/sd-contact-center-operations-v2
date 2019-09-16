package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRequestOutputModel
 */
public class CRContactCenterAdministrativePlanRequestOutputModel   {
  private CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private String contactCenterAdministrativePlanRequestActionTaskReference = null;

  private Object contactCenterAdministrativePlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get contactCenterAdministrativePlanInstanceRecord
   * @return contactCenterAdministrativePlanInstanceRecord
  **/

  public CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Administrative Plan instance request service call 
   * @return contactCenterAdministrativePlanRequestActionTaskReference
  **/

  public String getContactCenterAdministrativePlanRequestActionTaskReference() {
    return contactCenterAdministrativePlanRequestActionTaskReference;
  }

  public void setContactCenterAdministrativePlanRequestActionTaskReference(String contactCenterAdministrativePlanRequestActionTaskReference) {
    this.contactCenterAdministrativePlanRequestActionTaskReference = contactCenterAdministrativePlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return contactCenterAdministrativePlanRequestActionTaskRecord
  **/

  public Object getContactCenterAdministrativePlanRequestActionTaskRecord() {
    return contactCenterAdministrativePlanRequestActionTaskRecord;
  }

  public void setContactCenterAdministrativePlanRequestActionTaskRecord(Object contactCenterAdministrativePlanRequestActionTaskRecord) {
    this.contactCenterAdministrativePlanRequestActionTaskRecord = contactCenterAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

