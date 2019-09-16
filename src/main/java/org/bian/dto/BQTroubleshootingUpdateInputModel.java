package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingUpdateInputModel
 */
public class BQTroubleshootingUpdateInputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String troubleshootingInstanceReference = null;

  private BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private Object troubleshootingUpdateActionTaskRecord = null;

  private String troubleshootingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Contact Center Administrative Plan instance 
   * @return contactCenterAdministrativePlanInstanceReference
  **/

  public String getContactCenterAdministrativePlanInstanceReference() {
    return contactCenterAdministrativePlanInstanceReference;
  }

  public void setContactCenterAdministrativePlanInstanceReference(String contactCenterAdministrativePlanInstanceReference) {
    this.contactCenterAdministrativePlanInstanceReference = contactCenterAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting instance 
   * @return troubleshootingInstanceReference
  **/

  public String getTroubleshootingInstanceReference() {
    return troubleshootingInstanceReference;
  }

  public void setTroubleshootingInstanceReference(String troubleshootingInstanceReference) {
    this.troubleshootingInstanceReference = troubleshootingInstanceReference;
  }


  /**
   * Get troubleshootingInstanceRecord
   * @return troubleshootingInstanceRecord
  **/

  public BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord getTroubleshootingInstanceRecord() {
    return troubleshootingInstanceRecord;
  }

  public void setTroubleshootingInstanceRecord(BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord) {
    this.troubleshootingInstanceRecord = troubleshootingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return troubleshootingUpdateActionTaskRecord
  **/

  public Object getTroubleshootingUpdateActionTaskRecord() {
    return troubleshootingUpdateActionTaskRecord;
  }

  public void setTroubleshootingUpdateActionTaskRecord(Object troubleshootingUpdateActionTaskRecord) {
    this.troubleshootingUpdateActionTaskRecord = troubleshootingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return troubleshootingUpdateActionRequest
  **/

  public String getTroubleshootingUpdateActionRequest() {
    return troubleshootingUpdateActionRequest;
  }

  public void setTroubleshootingUpdateActionRequest(String troubleshootingUpdateActionRequest) {
    this.troubleshootingUpdateActionRequest = troubleshootingUpdateActionRequest;
  }


}

