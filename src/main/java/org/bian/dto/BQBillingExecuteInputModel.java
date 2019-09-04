package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingExecuteInputModelBillingInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQBillingExecuteInputModel
 */
public class BQBillingExecuteInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String billingInstanceReference = null;

  private BQBillingExecuteInputModelBillingInstanceRecord billingInstanceRecord = null;

  private Object billingExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQBillingExecuteInputModelBillingInstanceRecord getBillingInstanceRecord() {
    return billingInstanceRecord;
  }

  public void setBillingInstanceRecord(BQBillingExecuteInputModelBillingInstanceRecord billingInstanceRecord) {
    this.billingInstanceRecord = billingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return billingExecuteActionTaskRecord
  **/

  public Object getBillingExecuteActionTaskRecord() {
    return billingExecuteActionTaskRecord;
  }

  public void setBillingExecuteActionTaskRecord(Object billingExecuteActionTaskRecord) {
    this.billingExecuteActionTaskRecord = billingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

