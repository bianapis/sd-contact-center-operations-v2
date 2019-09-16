package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord
 */
public class BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord   {
  private Object contactCenterProductionIssueRecord = null;

  private String contactCenterIssueAnalysisAndRecommendedResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content) 
   * @return contactCenterProductionIssueRecord
  **/

  public Object getContactCenterProductionIssueRecord() {
    return contactCenterProductionIssueRecord;
  }

  public void setContactCenterProductionIssueRecord(Object contactCenterProductionIssueRecord) {
    this.contactCenterProductionIssueRecord = contactCenterProductionIssueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the root cause analysis for recurring issues and suggested remedial action 
   * @return contactCenterIssueAnalysisAndRecommendedResponse
  **/

  public String getContactCenterIssueAnalysisAndRecommendedResponse() {
    return contactCenterIssueAnalysisAndRecommendedResponse;
  }

  public void setContactCenterIssueAnalysisAndRecommendedResponse(String contactCenterIssueAnalysisAndRecommendedResponse) {
    this.contactCenterIssueAnalysisAndRecommendedResponse = contactCenterIssueAnalysisAndRecommendedResponse;
  }


}

