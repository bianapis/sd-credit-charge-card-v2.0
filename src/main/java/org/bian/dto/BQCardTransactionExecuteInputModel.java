package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExecuteInputModelCardTransactionInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExecuteInputModel
 */
public class BQCardTransactionExecuteInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String cardTransactionInstanceReference = null;

  private BQCardTransactionExecuteInputModelCardTransactionInstanceRecord cardTransactionInstanceRecord = null;

  private Object cardTransactionExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Transaction instance 
   * @return cardTransactionInstanceReference
  **/

  public String getCardTransactionInstanceReference() {
    return cardTransactionInstanceReference;
  }

  public void setCardTransactionInstanceReference(String cardTransactionInstanceReference) {
    this.cardTransactionInstanceReference = cardTransactionInstanceReference;
  }


  /**
   * Get cardTransactionInstanceRecord
   * @return cardTransactionInstanceRecord
  **/

  public BQCardTransactionExecuteInputModelCardTransactionInstanceRecord getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(BQCardTransactionExecuteInputModelCardTransactionInstanceRecord cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cardTransactionExecuteActionTaskRecord
  **/

  public Object getCardTransactionExecuteActionTaskRecord() {
    return cardTransactionExecuteActionTaskRecord;
  }

  public void setCardTransactionExecuteActionTaskRecord(Object cardTransactionExecuteActionTaskRecord) {
    this.cardTransactionExecuteActionTaskRecord = cardTransactionExecuteActionTaskRecord;
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

