package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanInitiateInputModelCreditPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditPlanInitiateOutputModel
 */
public class BQCreditPlanInitiateOutputModel   {
  private String creditPlanInstanceReference = null;

  private String creditPlanInitiateActionReference = null;

  private Object creditPlanInitiateActionRecord = null;

  private String creditPlanInstanceStatus = null;

  private BQCreditPlanInitiateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Plan instance 
   * @return creditPlanInstanceReference
  **/

  public String getCreditPlanInstanceReference() {
    return creditPlanInstanceReference;
  }

  public void setCreditPlanInstanceReference(String creditPlanInstanceReference) {
    this.creditPlanInstanceReference = creditPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return creditPlanInitiateActionReference
  **/

  public String getCreditPlanInitiateActionReference() {
    return creditPlanInitiateActionReference;
  }

  public void setCreditPlanInitiateActionReference(String creditPlanInitiateActionReference) {
    this.creditPlanInitiateActionReference = creditPlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return creditPlanInitiateActionRecord
  **/

  public Object getCreditPlanInitiateActionRecord() {
    return creditPlanInitiateActionRecord;
  }

  public void setCreditPlanInitiateActionRecord(Object creditPlanInitiateActionRecord) {
    this.creditPlanInitiateActionRecord = creditPlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Plan instance (e.g. initialised, pending, active) 
   * @return creditPlanInstanceStatus
  **/

  public String getCreditPlanInstanceStatus() {
    return creditPlanInstanceStatus;
  }

  public void setCreditPlanInstanceStatus(String creditPlanInstanceStatus) {
    this.creditPlanInstanceStatus = creditPlanInstanceStatus;
  }


  /**
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanInitiateInputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanInitiateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


}

