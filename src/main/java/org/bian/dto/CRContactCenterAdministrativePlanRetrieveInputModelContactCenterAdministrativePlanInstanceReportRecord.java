package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord
 */
public class CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord   {
  private String contactCenterAdministrativePlanInstanceReportReference = null;

  private String contactCenterAdministrativePlanInstanceReportType = null;

  private String contactCenterAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return contactCenterAdministrativePlanInstanceReportReference
  **/

  public String getContactCenterAdministrativePlanInstanceReportReference() {
    return contactCenterAdministrativePlanInstanceReportReference;
  }

  public void setContactCenterAdministrativePlanInstanceReportReference(String contactCenterAdministrativePlanInstanceReportReference) {
    this.contactCenterAdministrativePlanInstanceReportReference = contactCenterAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return contactCenterAdministrativePlanInstanceReportType
  **/

  public String getContactCenterAdministrativePlanInstanceReportType() {
    return contactCenterAdministrativePlanInstanceReportType;
  }

  public void setContactCenterAdministrativePlanInstanceReportType(String contactCenterAdministrativePlanInstanceReportType) {
    this.contactCenterAdministrativePlanInstanceReportType = contactCenterAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return contactCenterAdministrativePlanInstanceReportParameters
  **/

  public String getContactCenterAdministrativePlanInstanceReportParameters() {
    return contactCenterAdministrativePlanInstanceReportParameters;
  }

  public void setContactCenterAdministrativePlanInstanceReportParameters(String contactCenterAdministrativePlanInstanceReportParameters) {
    this.contactCenterAdministrativePlanInstanceReportParameters = contactCenterAdministrativePlanInstanceReportParameters;
  }


}

