package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceRecord;
import org.bian.dto.CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveOutputModel
 */
public class CRContactCenterAdministrativePlanRetrieveOutputModel   {
  private CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord = null;

  private String contactCenterAdministrativePlanRetrieveActionTaskReference = null;

  private Object contactCenterAdministrativePlanRetrieveActionTaskRecord = null;

  private String contactCenterAdministrativePlanRetrieveActionResponse = null;

  private CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord contactCenterAdministrativePlanInstanceReportRecord = null;

  private CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis contactCenterAdministrativePlanInstanceAnalysis = null;


  /**
   * Get contactCenterAdministrativePlanInstanceRecord
   * @return contactCenterAdministrativePlanInstanceRecord
  **/

  public CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceRecord getContactCenterAdministrativePlanInstanceRecord() {
    return contactCenterAdministrativePlanInstanceRecord;
  }

  public void setContactCenterAdministrativePlanInstanceRecord(CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceRecord contactCenterAdministrativePlanInstanceRecord) {
    this.contactCenterAdministrativePlanInstanceRecord = contactCenterAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Administrative Plan instance retrieve service call 
   * @return contactCenterAdministrativePlanRetrieveActionTaskReference
  **/

  public String getContactCenterAdministrativePlanRetrieveActionTaskReference() {
    return contactCenterAdministrativePlanRetrieveActionTaskReference;
  }

  public void setContactCenterAdministrativePlanRetrieveActionTaskReference(String contactCenterAdministrativePlanRetrieveActionTaskReference) {
    this.contactCenterAdministrativePlanRetrieveActionTaskReference = contactCenterAdministrativePlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return contactCenterAdministrativePlanRetrieveActionResponse
  **/

  public String getContactCenterAdministrativePlanRetrieveActionResponse() {
    return contactCenterAdministrativePlanRetrieveActionResponse;
  }

  public void setContactCenterAdministrativePlanRetrieveActionResponse(String contactCenterAdministrativePlanRetrieveActionResponse) {
    this.contactCenterAdministrativePlanRetrieveActionResponse = contactCenterAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceReportRecord
   * @return contactCenterAdministrativePlanInstanceReportRecord
  **/

  public CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord getContactCenterAdministrativePlanInstanceReportRecord() {
    return contactCenterAdministrativePlanInstanceReportRecord;
  }

  public void setContactCenterAdministrativePlanInstanceReportRecord(CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord contactCenterAdministrativePlanInstanceReportRecord) {
    this.contactCenterAdministrativePlanInstanceReportRecord = contactCenterAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get contactCenterAdministrativePlanInstanceAnalysis
   * @return contactCenterAdministrativePlanInstanceAnalysis
  **/

  public CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis getContactCenterAdministrativePlanInstanceAnalysis() {
    return contactCenterAdministrativePlanInstanceAnalysis;
  }

  public void setContactCenterAdministrativePlanInstanceAnalysis(CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceAnalysis contactCenterAdministrativePlanInstanceAnalysis) {
    this.contactCenterAdministrativePlanInstanceAnalysis = contactCenterAdministrativePlanInstanceAnalysis;
  }


}

