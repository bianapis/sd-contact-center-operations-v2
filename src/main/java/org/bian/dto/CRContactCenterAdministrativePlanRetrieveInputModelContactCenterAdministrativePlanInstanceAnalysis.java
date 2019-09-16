package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis
 */
public class CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis   {
  private String contactCenterAdministrativePlanInstanceAnalysisReference = null;

  private String contactCenterAdministrativePlanInstanceAnalysisReportType = null;

  private String contactCenterAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return contactCenterAdministrativePlanInstanceAnalysisReference
  **/

  public String getContactCenterAdministrativePlanInstanceAnalysisReference() {
    return contactCenterAdministrativePlanInstanceAnalysisReference;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysisReference(String contactCenterAdministrativePlanInstanceAnalysisReference) {
    this.contactCenterAdministrativePlanInstanceAnalysisReference = contactCenterAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return contactCenterAdministrativePlanInstanceAnalysisReportType
  **/

  public String getContactCenterAdministrativePlanInstanceAnalysisReportType() {
    return contactCenterAdministrativePlanInstanceAnalysisReportType;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysisReportType(String contactCenterAdministrativePlanInstanceAnalysisReportType) {
    this.contactCenterAdministrativePlanInstanceAnalysisReportType = contactCenterAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return contactCenterAdministrativePlanInstanceAnalysisParameters
  **/

  public String getContactCenterAdministrativePlanInstanceAnalysisParameters() {
    return contactCenterAdministrativePlanInstanceAnalysisParameters;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysisParameters(String contactCenterAdministrativePlanInstanceAnalysisParameters) {
    this.contactCenterAdministrativePlanInstanceAnalysisParameters = contactCenterAdministrativePlanInstanceAnalysisParameters;
  }


}

