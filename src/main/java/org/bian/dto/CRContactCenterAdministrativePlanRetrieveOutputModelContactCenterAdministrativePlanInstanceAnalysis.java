package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis
 */
public class CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis   {
  private String contactCenterAdministrativePlanInstanceAnalysisData = null;

  private String contactCenterAdministrativePlanInstanceAnalysisReportType = null;

  private Object contactCenterAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return contactCenterAdministrativePlanInstanceAnalysisData
  **/

  public String getContactCenterAdministrativePlanInstanceAnalysisData() {
    return contactCenterAdministrativePlanInstanceAnalysisData;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysisData(String contactCenterAdministrativePlanInstanceAnalysisData) {
    this.contactCenterAdministrativePlanInstanceAnalysisData = contactCenterAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return contactCenterAdministrativePlanInstanceAnalysisReport
  **/

  public Object getContactCenterAdministrativePlanInstanceAnalysisReport() {
    return contactCenterAdministrativePlanInstanceAnalysisReport;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysisReport(Object contactCenterAdministrativePlanInstanceAnalysisReport) {
    this.contactCenterAdministrativePlanInstanceAnalysisReport = contactCenterAdministrativePlanInstanceAnalysisReport;
  }


}

