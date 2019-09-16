package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanCreateOutputModel
 */
public class CRContactCenterAdministrativePlanCreateOutputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String contactCenterAdministrativePlanCreateActionReference = null;

  private Object contactCenterAdministrativePlanCreateActionRecord = null;

  private String contactCenterAdministrativePlanInstanceStatus = null;

  private CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return contactCenterAdministrativePlanCreateActionReference
  **/

  public String getContactCenterAdministrativePlanCreateActionReference() {
    return contactCenterAdministrativePlanCreateActionReference;
  }

  public void setContactCenterAdministrativePlanCreateActionReference(String contactCenterAdministrativePlanCreateActionReference) {
    this.contactCenterAdministrativePlanCreateActionReference = contactCenterAdministrativePlanCreateActionReference;
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

