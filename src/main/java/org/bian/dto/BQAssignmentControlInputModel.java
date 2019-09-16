package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssignmentControlInputModel
 */
public class BQAssignmentControlInputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String assignmentInstanceReference = null;

  private Object assignmentControlActionTaskRecord = null;

  private CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest assignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment instance 
   * @return assignmentInstanceReference
  **/

  public String getAssignmentInstanceReference() {
    return assignmentInstanceReference;
  }

  public void setAssignmentInstanceReference(String assignmentInstanceReference) {
    this.assignmentInstanceReference = assignmentInstanceReference;
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
   * Get assignmentControlActionRequest
   * @return assignmentControlActionRequest
  **/

  public CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest getAssignmentControlActionRequest() {
    return assignmentControlActionRequest;
  }

  public void setAssignmentControlActionRequest(CRContactCenterAdministrativePlanControlInputModelContactCenterAdministrativePlanControlActionRequest assignmentControlActionRequest) {
    this.assignmentControlActionRequest = assignmentControlActionRequest;
  }


}

