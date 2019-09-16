package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPeakLoadUpdateInputModel
 */
public class BQPeakLoadUpdateInputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String peakLoadInstanceReference = null;

  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord = null;

  private Object peakLoadUpdateActionTaskRecord = null;

  private String peakLoadUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Contact Center Administrative Plan instance 
   * @return contactCenterAdministrativePlanInstanceReference
  **/

  public String getContactCenterAdministrativePlanInstanceReference() {
    return contactCenterAdministrativePlanInstanceReference;
  }

  public void setContactCenterAdministrativePlanInstanceReference(String contactCenterAdministrativePlanInstanceReference) {
    this.contactCenterAdministrativePlanInstanceReference = contactCenterAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Peak Load instance 
   * @return peakLoadInstanceReference
  **/

  public String getPeakLoadInstanceReference() {
    return peakLoadInstanceReference;
  }

  public void setPeakLoadInstanceReference(String peakLoadInstanceReference) {
    this.peakLoadInstanceReference = peakLoadInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return peakLoadUpdateActionRequest
  **/

  public String getPeakLoadUpdateActionRequest() {
    return peakLoadUpdateActionRequest;
  }

  public void setPeakLoadUpdateActionRequest(String peakLoadUpdateActionRequest) {
    this.peakLoadUpdateActionRequest = peakLoadUpdateActionRequest;
  }


}

