package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask
 */
public class BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask   {
  private String peakLoadResponseTaskType = null;

  private String peakLoadResponseDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of response (e.g. staff reassignment) 
   * @return peakLoadResponseTaskType
  **/

  public String getPeakLoadResponseTaskType() {
    return peakLoadResponseTaskType;
  }

  public void setPeakLoadResponseTaskType(String peakLoadResponseTaskType) {
    this.peakLoadResponseTaskType = peakLoadResponseTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the action taken and impact to service performance 
   * @return peakLoadResponseDescription
  **/

  public String getPeakLoadResponseDescription() {
    return peakLoadResponseDescription;
  }

  public void setPeakLoadResponseDescription(String peakLoadResponseDescription) {
    this.peakLoadResponseDescription = peakLoadResponseDescription;
  }


}

