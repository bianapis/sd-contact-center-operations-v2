package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis;
import org.bian.dto.BQPeakLoadRetrieveInputModelPeakLoadInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRetrieveInputModel
 */
public class BQPeakLoadRetrieveInputModel   {
  private Object peakLoadRetrieveActionTaskRecord = null;

  private String peakLoadRetrieveActionRequest = null;

  private BQPeakLoadRetrieveInputModelPeakLoadInstanceReport peakLoadInstanceReport = null;

  private BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis peakLoadInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return peakLoadRetrieveActionTaskRecord
  **/

  public Object getPeakLoadRetrieveActionTaskRecord() {
    return peakLoadRetrieveActionTaskRecord;
  }

  public void setPeakLoadRetrieveActionTaskRecord(Object peakLoadRetrieveActionTaskRecord) {
    this.peakLoadRetrieveActionTaskRecord = peakLoadRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return peakLoadRetrieveActionRequest
  **/

  public String getPeakLoadRetrieveActionRequest() {
    return peakLoadRetrieveActionRequest;
  }

  public void setPeakLoadRetrieveActionRequest(String peakLoadRetrieveActionRequest) {
    this.peakLoadRetrieveActionRequest = peakLoadRetrieveActionRequest;
  }


  /**
   * Get peakLoadInstanceReport
   * @return peakLoadInstanceReport
  **/

  public BQPeakLoadRetrieveInputModelPeakLoadInstanceReport getPeakLoadInstanceReport() {
    return peakLoadInstanceReport;
  }

  public void setPeakLoadInstanceReport(BQPeakLoadRetrieveInputModelPeakLoadInstanceReport peakLoadInstanceReport) {
    this.peakLoadInstanceReport = peakLoadInstanceReport;
  }


  /**
   * Get peakLoadInstanceAnalysis
   * @return peakLoadInstanceAnalysis
  **/

  public BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis getPeakLoadInstanceAnalysis() {
    return peakLoadInstanceAnalysis;
  }

  public void setPeakLoadInstanceAnalysis(BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis peakLoadInstanceAnalysis) {
    this.peakLoadInstanceAnalysis = peakLoadInstanceAnalysis;
  }


}

