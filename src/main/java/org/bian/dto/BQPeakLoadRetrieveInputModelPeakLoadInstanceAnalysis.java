package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis
 */
public class BQPeakLoadRetrieveInputModelPeakLoadInstanceAnalysis   {
  private String peakLoadInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return peakLoadInstanceAnalysisReference
  **/

  public String getPeakLoadInstanceAnalysisReference() {
    return peakLoadInstanceAnalysisReference;
  }

  public void setPeakLoadInstanceAnalysisReference(String peakLoadInstanceAnalysisReference) {
    this.peakLoadInstanceAnalysisReference = peakLoadInstanceAnalysisReference;
  }


}

