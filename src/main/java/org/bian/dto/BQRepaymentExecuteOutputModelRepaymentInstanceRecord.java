package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentExecuteOutputModelRepaymentInstanceRecordRepaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQRepaymentExecuteOutputModelRepaymentInstanceRecord
 */
public class BQRepaymentExecuteOutputModelRepaymentInstanceRecord   {
  private BQRepaymentExecuteOutputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction = null;


  /**
   * Get repaymentTransaction
   * @return repaymentTransaction
  **/

  public BQRepaymentExecuteOutputModelRepaymentInstanceRecordRepaymentTransaction getRepaymentTransaction() {
    return repaymentTransaction;
  }

  public void setRepaymentTransaction(BQRepaymentExecuteOutputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction) {
    this.repaymentTransaction = repaymentTransaction;
  }


}

