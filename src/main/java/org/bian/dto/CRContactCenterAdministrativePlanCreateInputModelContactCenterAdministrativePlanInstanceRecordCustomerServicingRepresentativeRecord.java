package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord
 */
public class CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord   {
  private String customerServicingRepresentativeQualificationProfile = null;

  private String customerServicingRepresentativeLocation = null;

  private String customerServicingRepresentativeAvailabilitySchedule = null;

  private String customerServicingRepresentativeStatus = null;

  private Object customerServicingRepresentativeAssignmentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the qualification, expertise and level of experience of the servicing representative 
   * @return customerServicingRepresentativeQualificationProfile
  **/

  public String getCustomerServicingRepresentativeQualificationProfile() {
    return customerServicingRepresentativeQualificationProfile;
  }

  public void setCustomerServicingRepresentativeQualificationProfile(String customerServicingRepresentativeQualificationProfile) {
    this.customerServicingRepresentativeQualificationProfile = customerServicingRepresentativeQualificationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the locations the customer servicing representative can work from (can include remote working arrangements and time zone availability) 
   * @return customerServicingRepresentativeLocation
  **/

  public String getCustomerServicingRepresentativeLocation() {
    return customerServicingRepresentativeLocation;
  }

  public void setCustomerServicingRepresentativeLocation(String customerServicingRepresentativeLocation) {
    this.customerServicingRepresentativeLocation = customerServicingRepresentativeLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the time the customer servicing representative plans to be and is actually available for assignments which covers times for shift working and temporary/overtime assignments as may be necessary 
   * @return customerServicingRepresentativeAvailabilitySchedule
  **/

  public String getCustomerServicingRepresentativeAvailabilitySchedule() {
    return customerServicingRepresentativeAvailabilitySchedule;
  }

  public void setCustomerServicingRepresentativeAvailabilitySchedule(String customerServicingRepresentativeAvailabilitySchedule) {
    this.customerServicingRepresentativeAvailabilitySchedule = customerServicingRepresentativeAvailabilitySchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the current status indicating availability for assignment to a servicing position (where the representative will coordinate with contact routing for customer contacts) 
   * @return customerServicingRepresentativeStatus
  **/

  public String getCustomerServicingRepresentativeStatus() {
    return customerServicingRepresentativeStatus;
  }

  public void setCustomerServicingRepresentativeStatus(String customerServicingRepresentativeStatus) {
    this.customerServicingRepresentativeStatus = customerServicingRepresentativeStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Reference to a consolidated record of assignments. This is used to track utilization and performance 
   * @return customerServicingRepresentativeAssignmentRecord
  **/

  public Object getCustomerServicingRepresentativeAssignmentRecord() {
    return customerServicingRepresentativeAssignmentRecord;
  }

  public void setCustomerServicingRepresentativeAssignmentRecord(Object customerServicingRepresentativeAssignmentRecord) {
    this.customerServicingRepresentativeAssignmentRecord = customerServicingRepresentativeAssignmentRecord;
  }


}

