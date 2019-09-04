package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelInterestInstanceRecord
 */
public class BQBillingRetrieveOutputModelInterestInstanceRecord   {
  private BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord = null;


  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  **/

  public BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }


}

