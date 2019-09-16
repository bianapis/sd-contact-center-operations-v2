package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingCreateOutputModel
 */
public class BQTroubleshootingCreateOutputModel   {
  private String troubleshootingInstanceReference = null;

  private String troubleshootingInitiateActionReference = null;

  private Object troubleshootingInitiateActionRecord = null;

  private String troubleshootingInstanceStatus = null;

  private BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return troubleshootingInitiateActionReference
  **/

  public String getTroubleshootingInitiateActionReference() {
    return troubleshootingInitiateActionReference;
  }

  public void setTroubleshootingInitiateActionReference(String troubleshootingInitiateActionReference) {
    this.troubleshootingInitiateActionReference = troubleshootingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootingInitiateActionRecord
  **/

  public Object getTroubleshootingInitiateActionRecord() {
    return troubleshootingInitiateActionRecord;
  }

  public void setTroubleshootingInitiateActionRecord(Object troubleshootingInitiateActionRecord) {
    this.troubleshootingInitiateActionRecord = troubleshootingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Troubleshooting instance (e.g. initialised, pending, active) 
   * @return troubleshootingInstanceStatus
  **/

  public String getTroubleshootingInstanceStatus() {
    return troubleshootingInstanceStatus;
  }

  public void setTroubleshootingInstanceStatus(String troubleshootingInstanceStatus) {
    this.troubleshootingInstanceStatus = troubleshootingInstanceStatus;
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


}

