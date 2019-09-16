package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord;
import org.bian.dto.CRContactCenterAdministrativePlanExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanExecuteInputModel
 */
public class CRContactCenterAdministrativePlanExecuteInputModel   {
  private String contactCenterOperationsServicingSessionReference = null;

  private String contactCenterAdministrativePlanInstanceReference = null;

  private CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private Object contactCenterAdministrativePlanExecuteActionTaskRecord = null;

  private CRContactCenterAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return contactCenterAdministrativePlanExecuteActionTaskRecord
  **/

  public Object getContactCenterAdministrativePlanExecuteActionTaskRecord() {
    return contactCenterAdministrativePlanExecuteActionTaskRecord;
  }

  public void setContactCenterAdministrativePlanExecuteActionTaskRecord(Object contactCenterAdministrativePlanExecuteActionTaskRecord) {
    this.contactCenterAdministrativePlanExecuteActionTaskRecord = contactCenterAdministrativePlanExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRContactCenterAdministrativePlanExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRContactCenterAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

