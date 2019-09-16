package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask;

import javax.validation.Valid;
  
/**
 * BQPeakLoadUpdateInputModelPeakLoadInstanceRecord
 */
public class BQPeakLoadUpdateInputModelPeakLoadInstanceRecord   {
  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics contactCenterServiceStatistics = null;

  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask peakLoadResponseTask = null;


  /**
   * Get contactCenterServiceStatistics
   * @return contactCenterServiceStatistics
  **/

  public BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics getContactCenterServiceStatistics() {
    return contactCenterServiceStatistics;
  }

  public void setContactCenterServiceStatistics(BQPeakLoadUpdateInputModelPeakLoadInstanceRecordContactCenterServiceStatistics contactCenterServiceStatistics) {
    this.contactCenterServiceStatistics = contactCenterServiceStatistics;
  }


  /**
   * Get peakLoadResponseTask
   * @return peakLoadResponseTask
  **/

  public BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask getPeakLoadResponseTask() {
    return peakLoadResponseTask;
  }

  public void setPeakLoadResponseTask(BQPeakLoadUpdateInputModelPeakLoadInstanceRecordPeakLoadResponseTask peakLoadResponseTask) {
    this.peakLoadResponseTask = peakLoadResponseTask;
  }


}

