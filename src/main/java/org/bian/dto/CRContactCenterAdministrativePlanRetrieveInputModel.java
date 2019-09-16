package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveInputModel
 */
public class CRContactCenterAdministrativePlanRetrieveInputModel   {
  private Object contactCenterAdministrativePlanRetrieveActionTaskRecord = null;

  private String contactCenterAdministrativePlanRetrieveActionRequest = null;

  private CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord contactCenterAdministrativePlanInstanceReportRecord = null;

  private CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis contactCenterAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contactCenterAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getContactCenterAdministrativePlanRetrieveActionTaskRecord() {
    return contactCenterAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setContactCenterAdministrativePlanRetrieveActionTaskRecord(Object contactCenterAdministrativePlanRetrieveActionTaskRecord) {
    this.contactCenterAdministrativePlanRetrieveActionTaskRecord = contactCenterAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return contactCenterAdministrativePlanRetrieveActionRequest
  **/

  public String getContactCenterAdministrativePlanRetrieveActionRequest() {
    return contactCenterAdministrativePlanRetrieveActionRequest;
  }

  public void setContactCenterAdministrativePlanRetrieveActionRequest(String contactCenterAdministrativePlanRetrieveActionRequest) {
    this.contactCenterAdministrativePlanRetrieveActionRequest = contactCenterAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceReportRecord
   * @return contactCenterAdministrativePlanInstanceReportRecord
  **/

  public CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord getContactCenterAdministrativePlanInstanceReportRecord() {
    return contactCenterAdministrativePlanInstanceReportRecord;
  }

  public void setContactCenterAdministrativePlanInstanceReportRecord(CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceReportRecord contactCenterAdministrativePlanInstanceReportRecord) {
    this.contactCenterAdministrativePlanInstanceReportRecord = contactCenterAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceAnalysis
   * @return contactCenterAdministrativePlanInstanceAnalysis
  **/

  public CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis getContactCenterAdministrativePlanInstanceAnalysis() {
    return contactCenterAdministrativePlanInstanceAnalysis;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysis(CRContactCenterAdministrativePlanRetrieveInputModelContactCenterAdministrativePlanInstanceAnalysis contactCenterAdministrativePlanInstanceAnalysis) {
    this.contactCenterAdministrativePlanInstanceAnalysis = contactCenterAdministrativePlanInstanceAnalysis;
  }


}

