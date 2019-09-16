package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPeakLoadUpdateInputModelPeakLoadInstanceRecord;
import org.bian.dto.CRContactCenterAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPeakLoadRequestInputModel
 */
public class BQPeakLoadRequestInputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String peakLoadInstanceReference = null;

  private BQPeakLoadUpdateInputModelPeakLoadInstanceRecord peakLoadInstanceRecord = null;

  private Object peakLoadRequestActionTaskRecord = null;

  private CRContactCenterAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return peakLoadRequestActionTaskRecord
  **/

  public Object getPeakLoadRequestActionTaskRecord() {
    return peakLoadRequestActionTaskRecord;
  }

  public void setPeakLoadRequestActionTaskRecord(Object peakLoadRequestActionTaskRecord) {
    this.peakLoadRequestActionTaskRecord = peakLoadRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRContactCenterAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRContactCenterAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

