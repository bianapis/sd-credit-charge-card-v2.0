package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceRecordBillingTransaction;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelBillingInstanceRecord
 */
public class BQBillingRetrieveOutputModelBillingInstanceRecord   {
  private String billingParameters = null;

  private BQBillingRetrieveOutputModelBillingInstanceRecordBillingTransaction billingTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the set-up for the billing processing (e.g. cycle date, type of billing, etc.) 
   * @return billingParameters
  **/

  public String getBillingParameters() {
    return billingParameters;
  }

  public void setBillingParameters(String billingParameters) {
    this.billingParameters = billingParameters;
  }


  /**
   * Get billingTransaction
   * @return billingTransaction
  **/

  public BQBillingRetrieveOutputModelBillingInstanceRecordBillingTransaction getBillingTransaction() {
    return billingTransaction;
  }

  public void setBillingTransaction(BQBillingRetrieveOutputModelBillingInstanceRecordBillingTransaction billingTransaction) {
    this.billingTransaction = billingTransaction;
  }


}

