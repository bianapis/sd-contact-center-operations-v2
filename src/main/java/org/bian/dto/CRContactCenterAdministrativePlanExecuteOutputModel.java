package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanExecuteOutputModel
 */
public class CRContactCenterAdministrativePlanExecuteOutputModel   {
  private CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private String contactCenterAdministrativePlanExecuteActionTaskReference = null;

  private Object contactCenterAdministrativePlanExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Administrative Plan instance execute service call 
   * @return contactCenterAdministrativePlanExecuteActionTaskReference
  **/

  public String getContactCenterAdministrativePlanExecuteActionTaskReference() {
    return contactCenterAdministrativePlanExecuteActionTaskReference;
  }

  public void setContactCenterAdministrativePlanExecuteActionTaskReference(String contactCenterAdministrativePlanExecuteActionTaskReference) {
    this.contactCenterAdministrativePlanExecuteActionTaskReference = contactCenterAdministrativePlanExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

