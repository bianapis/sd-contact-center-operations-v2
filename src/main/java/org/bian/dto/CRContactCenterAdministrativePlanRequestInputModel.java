package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord;
import org.bian.dto.CRContactCenterAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRequestInputModel
 */
public class CRContactCenterAdministrativePlanRequestInputModel   {
  private String contactCenterOperationsServicingSessionReference = null;

  private String contactCenterAdministrativePlanInstanceReference = null;

  private CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private Object contactCenterAdministrativePlanRequestActionTaskRecord = null;

  private CRContactCenterAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanRequestInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRContactCenterAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRContactCenterAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

