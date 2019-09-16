package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanUpdateOutputModel
 */
public class CRContactCenterAdministrativePlanUpdateOutputModel   {
  private CRContactCenterAdministrativePlanUpdateInputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private String contactCenterAdministrativePlanUpdateActionTaskReference = null;

  private Object contactCenterAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return contactCenterAdministrativePlanUpdateActionTaskReference
  **/

  public String getContactCenterAdministrativePlanUpdateActionTaskReference() {
    return contactCenterAdministrativePlanUpdateActionTaskReference;
  }

  public void setContactCenterAdministrativePlanUpdateActionTaskReference(String contactCenterAdministrativePlanUpdateActionTaskReference) {
    this.contactCenterAdministrativePlanUpdateActionTaskReference = contactCenterAdministrativePlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

