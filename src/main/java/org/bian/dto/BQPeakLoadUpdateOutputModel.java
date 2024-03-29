package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPeakLoadUpdateOutputModel
 */
public class BQPeakLoadUpdateOutputModel   {
  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord = null;

  private String peakLoadUpdateActionTaskReference = null;

  private Object peakLoadUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return peakLoadUpdateActionTaskReference
  **/

  public String getPeakLoadUpdateActionTaskReference() {
    return peakLoadUpdateActionTaskReference;
  }

  public void setPeakLoadUpdateActionTaskReference(String peakLoadUpdateActionTaskReference) {
    this.peakLoadUpdateActionTaskReference = peakLoadUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return peakLoadUpdateActionTaskRecord
  **/

  public Object getPeakLoadUpdateActionTaskRecord() {
    return peakLoadUpdateActionTaskRecord;
  }

  public void setPeakLoadUpdateActionTaskRecord(Object peakLoadUpdateActionTaskRecord) {
    this.peakLoadUpdateActionTaskRecord = peakLoadUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

