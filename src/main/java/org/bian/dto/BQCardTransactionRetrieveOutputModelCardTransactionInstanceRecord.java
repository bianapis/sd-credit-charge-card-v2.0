package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecordCardTransaction;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord
 */
public class BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecord   {
  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecordCardTransaction cardTransaction = null;


  /**
   * Get cardTransaction
   * @return cardTransaction
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecordCardTransaction getCardTransaction() {
    return cardTransaction;
  }

  public void setCardTransaction(BQCardTransactionRetrieveOutputModelCardTransactionInstanceRecordCardTransaction cardTransaction) {
    this.cardTransaction = cardTransaction;
  }


}

