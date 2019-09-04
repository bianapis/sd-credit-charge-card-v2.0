package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExecuteOutputModelCardTransactionInstanceRecordCardTransaction;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord
 */
public class BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord   {
  private BQCardTransactionExecuteOutputModelCardTransactionInstanceRecordCardTransaction cardTransaction = null;


  /**
   * Get cardTransaction
   * @return cardTransaction
  **/

  public BQCardTransactionExecuteOutputModelCardTransactionInstanceRecordCardTransaction getCardTransaction() {
    return cardTransaction;
  }

  public void setCardTransaction(BQCardTransactionExecuteOutputModelCardTransactionInstanceRecordCardTransaction cardTransaction) {
    this.cardTransaction = cardTransaction;
  }


}

