package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingUpdateInputModelBillingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBillingUpdateInputModel
 */
public class BQBillingUpdateInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String billingInstanceReference = null;

  private BQBillingUpdateInputModelBillingInstanceRecord billingInstanceRecord = null;

  private Object billingUpdateActionTaskRecord = null;

  private String billingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Billing instance 
   * @return billingInstanceReference
  **/

  public String getBillingInstanceReference() {
    return billingInstanceReference;
  }

  public void setBillingInstanceReference(String billingInstanceReference) {
    this.billingInstanceReference = billingInstanceReference;
  }


  /**
   * Get billingInstanceRecord
   * @return billingInstanceRecord
  **/

  public BQBillingUpdateInputModelBillingInstanceRecord getBillingInstanceRecord() {
    return billingInstanceRecord;
  }

  public void setBillingInstanceRecord(BQBillingUpdateInputModelBillingInstanceRecord billingInstanceRecord) {
    this.billingInstanceRecord = billingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return billingUpdateActionTaskRecord
  **/

  public Object getBillingUpdateActionTaskRecord() {
    return billingUpdateActionTaskRecord;
  }

  public void setBillingUpdateActionTaskRecord(Object billingUpdateActionTaskRecord) {
    this.billingUpdateActionTaskRecord = billingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return billingUpdateActionRequest
  **/

  public String getBillingUpdateActionRequest() {
    return billingUpdateActionRequest;
  }

  public void setBillingUpdateActionRequest(String billingUpdateActionRequest) {
    this.billingUpdateActionRequest = billingUpdateActionRequest;
  }


}

