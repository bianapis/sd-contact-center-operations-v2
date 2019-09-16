package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord
 */
public class CRContactCenterAdministrativePlanRetrieveOutputModelContactCenterAdministrativePlanInstanceReportRecord   {
  private String contactCenterAdministrativePlanInstanceReportData = null;

  private String contactCenterAdministrativePlanInstanceReportType = null;

  private Object contactCenterAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return contactCenterAdministrativePlanInstanceReportData
  **/

  public String getContactCenterAdministrativePlanInstanceReportData() {
    return contactCenterAdministrativePlanInstanceReportData;
  }

  public void setContactCenterAdministrativePlanInstanceReportData(String contactCenterAdministrativePlanInstanceReportData) {
    this.contactCenterAdministrativePlanInstanceReportData = contactCenterAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return contactCenterAdministrativePlanInstanceReportType
  **/

  public String getContactCenterAdministrativePlanInstanceReportType() {
    return contactCenterAdministrativePlanInstanceReportType;
  }

  public void setContactCenterAdministrativePlanInstanceReportType(String contactCenterAdministrativePlanInstanceReportType) {
    this.contactCenterAdministrativePlanInstanceReportType = contactCenterAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return contactCenterAdministrativePlanInstanceReport
  **/

  public Object getContactCenterAdministrativePlanInstanceReport() {
    return contactCenterAdministrativePlanInstanceReport;
  }

  public void setContactCenterAdministrativePlanInstanceReport(Object contactCenterAdministrativePlanInstanceReport) {
    this.contactCenterAdministrativePlanInstanceReport = contactCenterAdministrativePlanInstanceReport;
  }


}

