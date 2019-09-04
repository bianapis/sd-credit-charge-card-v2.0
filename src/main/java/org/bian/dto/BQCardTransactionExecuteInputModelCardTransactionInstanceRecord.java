package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExecuteInputModelCardTransactionInstanceRecordCardTransaction;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExecuteInputModelCardTransactionInstanceRecord
 */
public class BQCardTransactionExecuteInputModelCardTransactionInstanceRecord   {
  private BQCardTransactionExecuteInputModelCardTransactionInstanceRecordCardTransaction cardTransaction = null;


  /**
   * Get cardTransaction
   * @return cardTransaction
  **/

  public BQCardTransactionExecuteInputModelCardTransactionInstanceRecordCardTransaction getCardTransaction() {
    return cardTransaction;
  }

  public void setCardTransaction(BQCardTransactionExecuteInputModelCardTransactionInstanceRecordCardTransaction cardTransaction) {
    this.cardTransaction = cardTransaction;
  }


}

