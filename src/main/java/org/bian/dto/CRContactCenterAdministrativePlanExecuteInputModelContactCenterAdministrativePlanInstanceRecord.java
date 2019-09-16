package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord
 */
public class CRContactCenterAdministrativePlanExecuteInputModelContactCenterAdministrativePlanInstanceRecord   {
  private String contactCenterServiceOperatingConfiguration = null;

  private String customerServicingRepresentativeAllocationSchedule = null;

  private String customerServicingRepresentativeReference = null;

  private CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord customerServicingRepresentativeRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default contact center operational configuration as defined by Contact Center Management (Note this can include some latitude for position assignment changes to be made during day to day operations by this service domain) 
   * @return contactCenterServiceOperatingConfiguration
  **/

  public String getContactCenterServiceOperatingConfiguration() {
    return contactCenterServiceOperatingConfiguration;
  }

  public void setContactCenterServiceOperatingConfiguration(String contactCenterServiceOperatingConfiguration) {
    this.contactCenterServiceOperatingConfiguration = contactCenterServiceOperatingConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains the allocation records of available customer service representatives to the servicing positions defined in the contact center configuration. This includes past and future booking arrangements 
   * @return customerServicingRepresentativeAllocationSchedule
  **/

  public String getCustomerServicingRepresentativeAllocationSchedule() {
    return customerServicingRepresentativeAllocationSchedule;
  }

  public void setCustomerServicingRepresentativeAllocationSchedule(String customerServicingRepresentativeAllocationSchedule) {
    this.customerServicingRepresentativeAllocationSchedule = customerServicingRepresentativeAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a customer servicing representative 
   * @return customerServicingRepresentativeReference
  **/

  public String getCustomerServicingRepresentativeReference() {
    return customerServicingRepresentativeReference;
  }

  public void setCustomerServicingRepresentativeReference(String customerServicingRepresentativeReference) {
    this.customerServicingRepresentativeReference = customerServicingRepresentativeReference;
  }


  /**
   * Get customerServicingRepresentativeRecord
   * @return customerServicingRepresentativeRecord
  **/

  public CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord getCustomerServicingRepresentativeRecord() {
    return customerServicingRepresentativeRecord;
  }

  public void setCustomerServicingRepresentativeRecord(CRContactCenterAdministrativePlanCreateInputModelContactCenterAdministrativePlanInstanceRecordCustomerServicingRepresentativeRecord customerServicingRepresentativeRecord) {
    this.customerServicingRepresentativeRecord = customerServicingRepresentativeRecord;
  }


}

