package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQCreditPlanInitiateInputModelCreditPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditPlanInitiateInputModel
 */
public class BQCreditPlanInitiateInputModel   {
  private BQCreditPlanInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private Object creditPlanInitiateActionRecord = null;

  private BQCreditPlanInitiateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public BQCreditPlanInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQCreditPlanInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


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

