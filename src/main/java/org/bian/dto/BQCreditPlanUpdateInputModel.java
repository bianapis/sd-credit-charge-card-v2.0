package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanUpdateInputModelCreditPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditPlanUpdateInputModel
 */
public class BQCreditPlanUpdateInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String creditPlanInstanceReference = null;

  private BQCreditPlanUpdateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;

  private Object creditPlanUpdateActionTaskRecord = null;

  private String creditPlanUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


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
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanUpdateInputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanUpdateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditPlanUpdateActionTaskRecord
  **/

  public Object getCreditPlanUpdateActionTaskRecord() {
    return creditPlanUpdateActionTaskRecord;
  }

  public void setCreditPlanUpdateActionTaskRecord(Object creditPlanUpdateActionTaskRecord) {
    this.creditPlanUpdateActionTaskRecord = creditPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return creditPlanUpdateActionRequest
  **/

  public String getCreditPlanUpdateActionRequest() {
    return creditPlanUpdateActionRequest;
  }

  public void setCreditPlanUpdateActionRequest(String creditPlanUpdateActionRequest) {
    this.creditPlanUpdateActionRequest = creditPlanUpdateActionRequest;
  }


}

