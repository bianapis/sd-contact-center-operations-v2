package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentControlOutputModel
 */
public class BQAssignmentControlOutputModel   {
  private String assignmentControlActionTaskReference = null;

  private Object assignmentControlActionTaskRecord = null;

  private String assignmentControlActionResponse = null;

  private String assignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance control processing service call 
   * @return assignmentControlActionTaskReference
  **/

  public String getAssignmentControlActionTaskReference() {
    return assignmentControlActionTaskReference;
  }

  public void setAssignmentControlActionTaskReference(String assignmentControlActionTaskReference) {
    this.assignmentControlActionTaskReference = assignmentControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return assignmentControlActionTaskRecord
  **/

  public Object getAssignmentControlActionTaskRecord() {
    return assignmentControlActionTaskRecord;
  }

  public void setAssignmentControlActionTaskRecord(Object assignmentControlActionTaskRecord) {
    this.assignmentControlActionTaskRecord = assignmentControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return assignmentControlActionResponse
  **/

  public String getAssignmentControlActionResponse() {
    return assignmentControlActionResponse;
  }

  public void setAssignmentControlActionResponse(String assignmentControlActionResponse) {
    this.assignmentControlActionResponse = assignmentControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Assignment instance (e.g. initialised, pending, active) 
   * @return assignmentInstanceStatus
  **/

  public String getAssignmentInstanceStatus() {
    return assignmentInstanceStatus;
  }

  public void setAssignmentInstanceStatus(String assignmentInstanceStatus) {
    this.assignmentInstanceStatus = assignmentInstanceStatus;
  }


}

