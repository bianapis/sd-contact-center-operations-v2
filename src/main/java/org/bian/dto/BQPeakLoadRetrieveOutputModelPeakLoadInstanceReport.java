package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport
 */
public class BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport   {
  private Object peakLoadInstanceReportRecord = null;

  private String peakLoadInstanceReportType = null;

  private String peakLoadInstanceReportParameters = null;

  private Object peakLoadInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return peakLoadInstanceReportRecord
  **/

  public Object getPeakLoadInstanceReportRecord() {
    return peakLoadInstanceReportRecord;
  }

  public void setPeakLoadInstanceReportRecord(Object peakLoadInstanceReportRecord) {
    this.peakLoadInstanceReportRecord = peakLoadInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return peakLoadInstanceReportType
  **/

  public String getPeakLoadInstanceReportType() {
    return peakLoadInstanceReportType;
  }

  public void setPeakLoadInstanceReportType(String peakLoadInstanceReportType) {
    this.peakLoadInstanceReportType = peakLoadInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return peakLoadInstanceReportParameters
  **/

  public String getPeakLoadInstanceReportParameters() {
    return peakLoadInstanceReportParameters;
  }

  public void setPeakLoadInstanceReportParameters(String peakLoadInstanceReportParameters) {
    this.peakLoadInstanceReportParameters = peakLoadInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return peakLoadInstanceReport
  **/

  public Object getPeakLoadInstanceReport() {
    return peakLoadInstanceReport;
  }

  public void setPeakLoadInstanceReport(Object peakLoadInstanceReport) {
    this.peakLoadInstanceReport = peakLoadInstanceReport;
  }


}

