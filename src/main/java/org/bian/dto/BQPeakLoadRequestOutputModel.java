package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRequestOutputModel
 */
public class BQPeakLoadRequestOutputModel   {
  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord = null;

  private String peakLoadRequestActionTaskReference = null;

  private Object peakLoadRequestActionTaskRecord = null;

  private String peakLoadRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Peak Load instance request service call 
   * @return peakLoadRequestActionTaskReference
  **/

  public String getPeakLoadRequestActionTaskReference() {
    return peakLoadRequestActionTaskReference;
  }

  public void setPeakLoadRequestActionTaskReference(String peakLoadRequestActionTaskReference) {
    this.peakLoadRequestActionTaskReference = peakLoadRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return peakLoadRequestActionTaskRecord
  **/

  public Object getPeakLoadRequestActionTaskRecord() {
    return peakLoadRequestActionTaskRecord;
  }

  public void setPeakLoadRequestActionTaskRecord(Object peakLoadRequestActionTaskRecord) {
    this.peakLoadRequestActionTaskRecord = peakLoadRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Peak Load service request record 
   * @return peakLoadRequestRecordReference
  **/

  public String getPeakLoadRequestRecordReference() {
    return peakLoadRequestRecordReference;
  }

  public void setPeakLoadRequestRecordReference(String peakLoadRequestRecordReference) {
    this.peakLoadRequestRecordReference = peakLoadRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

