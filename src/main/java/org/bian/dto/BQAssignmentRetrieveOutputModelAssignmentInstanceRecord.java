package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceRecordAssignmentCustomerServicingPositionSchedule;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModelAssignmentInstanceRecord
 */
public class BQAssignmentRetrieveOutputModelAssignmentInstanceRecord   {
  private String assignmentCustomerServicingRepresentative = null;

  private String assignmentCustomerServicingPositionReference = null;

  private String assignmentCustomerServicingPositionProfile = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceRecordAssignmentCustomerServicingPositionSchedule assignmentCustomerServicingPositionSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the servicing representative 
   * @return assignmentCustomerServicingRepresentative
  **/

  public String getAssignmentCustomerServicingRepresentative() {
    return assignmentCustomerServicingRepresentative;
  }

  public void setAssignmentCustomerServicingRepresentative(String assignmentCustomerServicingRepresentative) {
    this.assignmentCustomerServicingRepresentative = assignmentCustomerServicingRepresentative;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the assigned servicing position/desk within the contact center 
   * @return assignmentCustomerServicingPositionReference
  **/

  public String getAssignmentCustomerServicingPositionReference() {
    return assignmentCustomerServicingPositionReference;
  }

  public void setAssignmentCustomerServicingPositionReference(String assignmentCustomerServicingPositionReference) {
    this.assignmentCustomerServicingPositionReference = assignmentCustomerServicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details any specific properties for the assigned servicing position (e.g. type of product/service covered, required qualifications/certifications/experience) 
   * @return assignmentCustomerServicingPositionProfile
  **/

  public String getAssignmentCustomerServicingPositionProfile() {
    return assignmentCustomerServicingPositionProfile;
  }

  public void setAssignmentCustomerServicingPositionProfile(String assignmentCustomerServicingPositionProfile) {
    this.assignmentCustomerServicingPositionProfile = assignmentCustomerServicingPositionProfile;
  }


  /**
   * Get assignmentCustomerServicingPositionSchedule
   * @return assignmentCustomerServicingPositionSchedule
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceRecordAssignmentCustomerServicingPositionSchedule getAssignmentCustomerServicingPositionSchedule() {
    return assignmentCustomerServicingPositionSchedule;
  }

  public void setAssignmentCustomerServicingPositionSchedule(BQAssignmentRetrieveOutputModelAssignmentInstanceRecordAssignmentCustomerServicingPositionSchedule assignmentCustomerServicingPositionSchedule) {
    this.assignmentCustomerServicingPositionSchedule = assignmentCustomerServicingPositionSchedule;
  }


}

