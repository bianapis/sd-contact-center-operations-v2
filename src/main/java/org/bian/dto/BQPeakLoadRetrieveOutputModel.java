package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis;
import org.bian.dto.BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRetrieveOutputModel
 */
public class BQPeakLoadRetrieveOutputModel   {
  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord = null;

  private String peakLoadRetrieveActionTaskReference = null;

  private Object peakLoadRetrieveActionTaskRecord = null;

  private String peakLoadRetrieveActionResponse = null;

  private BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport peakLoadInstanceReport = null;

  private BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis peakLoadInstanceAnalysis = null;


  /**
   * Get peakLoadInstanceRecord
   * @return peakLoadInstanceRecord
  **/

  public BQPeakLoadUpdateInputModelPeakLoadInstanceRecord getPeakLoadInstanceRecord() {
    return peakLoadInstanceRecord;
  }

  public void setPeakLoadInstanceRecord(BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord) {
    this.peakLoadInstanceRecord = peakLoadInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Peak Load instance retrieve service call 
   * @return peakLoadRetrieveActionTaskReference
  **/

  public String getPeakLoadRetrieveActionTaskReference() {
    return peakLoadRetrieveActionTaskReference;
  }

  public void setPeakLoadRetrieveActionTaskReference(String peakLoadRetrieveActionTaskReference) {
    this.peakLoadRetrieveActionTaskReference = peakLoadRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return peakLoadRetrieveActionResponse
  **/

  public String getPeakLoadRetrieveActionResponse() {
    return peakLoadRetrieveActionResponse;
  }

  public void setPeakLoadRetrieveActionResponse(String peakLoadRetrieveActionResponse) {
    this.peakLoadRetrieveActionResponse = peakLoadRetrieveActionResponse;
  }


  /**
   * Get peakLoadInstanceReport
   * @return peakLoadInstanceReport
  **/

  public BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport getPeakLoadInstanceReport() {
    return peakLoadInstanceReport;
  }

  public void setPeakLoadInstanceReport(BQPeakLoadRetrieveOutputModelPeakLoadInstanceReport peakLoadInstanceReport) {
    this.peakLoadInstanceReport = peakLoadInstanceReport;
  }


  /**
   * Get peakLoadInstanceAnalysis
   * @return peakLoadInstanceAnalysis
  **/

  public BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis getPeakLoadInstanceAnalysis() {
    return peakLoadInstanceAnalysis;
  }

  public void setPeakLoadInstanceAnalysis(BQPeakLoadRetrieveOutputModelPeakLoadInstanceAnalysis peakLoadInstanceAnalysis) {
    this.peakLoadInstanceAnalysis = peakLoadInstanceAnalysis;
  }


}

