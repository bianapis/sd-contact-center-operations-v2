package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord;
import org.bian.dto.CRContactCenterAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRequestInputModel
 */
public class BQTroubleshootingRequestInputModel   {
  private String contactCenterAdministrativePlanInstanceReference = null;

  private String troubleshootingInstanceReference = null;

  private BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;

  private Object troubleshootingRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting instance 
   * @return troubleshootingInstanceReference
  **/

  public String getTroubleshootingInstanceReference() {
    return troubleshootingInstanceReference;
  }

  public void setTroubleshootingInstanceReference(String troubleshootingInstanceReference) {
    this.troubleshootingInstanceReference = troubleshootingInstanceReference;
  }


  /**
   * Get troubleshootingInstanceRecord
   * @return troubleshootingInstanceRecord
  **/

  public BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord getTroubleshootingInstanceRecord() {
    return troubleshootingInstanceRecord;
  }

  public void setTroubleshootingInstanceRecord(BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord) {
    this.troubleshootingInstanceRecord = troubleshootingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return troubleshootingRequestActionTaskRecord
  **/

  public Object getTroubleshootingRequestActionTaskRecord() {
    return troubleshootingRequestActionTaskRecord;
  }

  public void setTroubleshootingRequestActionTaskRecord(Object troubleshootingRequestActionTaskRecord) {
    this.troubleshootingRequestActionTaskRecord = troubleshootingRequestActionTaskRecord;
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

