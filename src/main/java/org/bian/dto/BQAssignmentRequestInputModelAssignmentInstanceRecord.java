package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRequestInputModelAssignmentInstanceRecord
 */
public class BQAssignmentRequestInputModelAssignmentInstanceRecord   {
  private String assignmentCustomerServicingRepresentative = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the servicing representative customerContactSessionProcedureInstanceReference:  type: string  example: \"771881\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the customer contact record for customer interactions during the servicing session 
   * @return assignmentCustomerServicingRepresentative
  **/

  public String getAssignmentCustomerServicingRepresentative() {
    return assignmentCustomerServicingRepresentative;
  }

  public void setAssignmentCustomerServicingRepresentative(String assignmentCustomerServicingRepresentative) {
    this.assignmentCustomerServicingRepresentative = assignmentCustomerServicingRepresentative;
  }


}

