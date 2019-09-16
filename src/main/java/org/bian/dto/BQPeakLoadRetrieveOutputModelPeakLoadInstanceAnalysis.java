package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis
 */
public class BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis   {
  private Object peakLoadInstanceAnalysisRecord = null;

  private String peakLoadInstanceAnalysisReportType = null;

  private String peakLoadInstanceAnalysisParameters = null;

  private Object peakLoadInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return peakLoadInstanceAnalysisRecord
  **/

  public Object getPeakLoadInstanceAnalysisRecord() {
    return peakLoadInstanceAnalysisRecord;
  }

  public void setPeakLoadInstanceAnalysisRecord(Object peakLoadInstanceAnalysisRecord) {
    this.peakLoadInstanceAnalysisRecord = peakLoadInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return peakLoadInstanceAnalysisReportType
  **/

  public String getPeakLoadInstanceAnalysisReportType() {
    return peakLoadInstanceAnalysisReportType;
  }

  public void setPeakLoadInstanceAnalysisReportType(String peakLoadInstanceAnalysisReportType) {
    this.peakLoadInstanceAnalysisReportType = peakLoadInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return peakLoadInstanceAnalysisParameters
  **/

  public String getPeakLoadInstanceAnalysisParameters() {
    return peakLoadInstanceAnalysisParameters;
  }

  public void setPeakLoadInstanceAnalysisParameters(String peakLoadInstanceAnalysisParameters) {
    this.peakLoadInstanceAnalysisParameters = peakLoadInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return peakLoadInstanceAnalysisReport
  **/

  public Object getPeakLoadInstanceAnalysisReport() {
    return peakLoadInstanceAnalysisReport;
  }

  public void setPeakLoadInstanceAnalysisReport(Object peakLoadInstanceAnalysisReport) {
    this.peakLoadInstanceAnalysisReport = peakLoadInstanceAnalysisReport;
  }


}

