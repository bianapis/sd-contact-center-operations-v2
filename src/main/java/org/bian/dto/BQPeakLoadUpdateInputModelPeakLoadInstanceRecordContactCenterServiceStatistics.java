package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics
 */
public class BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics   {
  private String contactCenterServiceStatisticType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of activity that is tracked and analyze (e.g. wait time, average handle time, dropped call ratio, resolution rate) 
   * @return contactCenterServiceStatisticType
  **/

  public String getContactCenterServiceStatisticType() {
    return contactCenterServiceStatisticType;
  }

  public void setContactCenterServiceStatisticType(String contactCenterServiceStatisticType) {
    this.contactCenterServiceStatisticType = contactCenterServiceStatisticType;
  }


}

