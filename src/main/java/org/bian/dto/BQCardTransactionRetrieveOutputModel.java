package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveOutputModel
 */
public class BQCardTransactionRetrieveOutputModel   {
  private BQCardTransactionRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord cardTransactionInstanceRecord = null;

  private String cardTransactionRetrieveActionTaskReference = null;

  private Object cardTransactionRetrieveActionTaskRecord = null;

  private String cardTransactionRetrieveActionResponse = null;

  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport cardTransactionInstanceReport = null;

  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public BQCardTransactionRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQCardTransactionRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get cardTransactionInstanceRecord
   * @return cardTransactionInstanceRecord
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction instance retrieve service call 
   * @return cardTransactionRetrieveActionTaskReference
  **/

  public String getCardTransactionRetrieveActionTaskReference() {
    return cardTransactionRetrieveActionTaskReference;
  }

  public void setCardTransactionRetrieveActionTaskReference(String cardTransactionRetrieveActionTaskReference) {
    this.cardTransactionRetrieveActionTaskReference = cardTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardTransactionRetrieveActionTaskRecord
  **/

  public Object getCardTransactionRetrieveActionTaskRecord() {
    return cardTransactionRetrieveActionTaskRecord;
  }

  public void setCardTransactionRetrieveActionTaskRecord(Object cardTransactionRetrieveActionTaskRecord) {
    this.cardTransactionRetrieveActionTaskRecord = cardTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardTransactionRetrieveActionResponse
  **/

  public String getCardTransactionRetrieveActionResponse() {
    return cardTransactionRetrieveActionResponse;
  }

  public void setCardTransactionRetrieveActionResponse(String cardTransactionRetrieveActionResponse) {
    this.cardTransactionRetrieveActionResponse = cardTransactionRetrieveActionResponse;
  }


  /**
   * Get cardTransactionInstanceReport
   * @return cardTransactionInstanceReport
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport getCardTransactionInstanceReport() {
    return cardTransactionInstanceReport;
  }

  public void setCardTransactionInstanceReport(BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport cardTransactionInstanceReport) {
    this.cardTransactionInstanceReport = cardTransactionInstanceReport;
  }


  /**
   * Get cardTransactionInstanceAnalysis
   * @return cardTransactionInstanceAnalysis
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis getCardTransactionInstanceAnalysis() {
    return cardTransactionInstanceAnalysis;
  }

  public void setCardTransactionInstanceAnalysis(BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis) {
    this.cardTransactionInstanceAnalysis = cardTransactionInstanceAnalysis;
  }


}

