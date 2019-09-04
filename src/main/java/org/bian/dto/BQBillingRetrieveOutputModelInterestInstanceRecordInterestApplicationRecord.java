package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord
 */
public class BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord   {
  private BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount = null;


  /**
   * Get interestTransaction
   * @return interestTransaction
  **/

  public BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction) {
    this.interestTransaction = interestTransaction;
  }


  /**
   * Get interestAccrualAmount
   * @return interestAccrualAmount
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount getInterestAccrualAmount() {
    return interestAccrualAmount;
  }

  public void setInterestAccrualAmount(BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
  }


}

