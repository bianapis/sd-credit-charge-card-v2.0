package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveInputModelBillingInstanceAnalysis;
import org.bian.dto.BQBillingRetrieveInputModelBillingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveInputModel
 */
public class BQBillingRetrieveInputModel   {
  private Object billingRetrieveActionTaskRecord = null;

  private String billingRetrieveActionRequest = null;

  private BQBillingRetrieveInputModelBillingInstanceReport billingInstanceReport = null;

  private BQBillingRetrieveInputModelBillingInstanceAnalysis billingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return billingRetrieveActionTaskRecord
  **/

  public Object getBillingRetrieveActionTaskRecord() {
    return billingRetrieveActionTaskRecord;
  }

  public void setBillingRetrieveActionTaskRecord(Object billingRetrieveActionTaskRecord) {
    this.billingRetrieveActionTaskRecord = billingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return billingRetrieveActionRequest
  **/

  public String getBillingRetrieveActionRequest() {
    return billingRetrieveActionRequest;
  }

  public void setBillingRetrieveActionRequest(String billingRetrieveActionRequest) {
    this.billingRetrieveActionRequest = billingRetrieveActionRequest;
  }


  /**
   * Get billingInstanceReport
   * @return billingInstanceReport
  **/

  public BQBillingRetrieveInputModelBillingInstanceReport getBillingInstanceReport() {
    return billingInstanceReport;
  }

  public void setBillingInstanceReport(BQBillingRetrieveInputModelBillingInstanceReport billingInstanceReport) {
    this.billingInstanceReport = billingInstanceReport;
  }


  /**
   * Get billingInstanceAnalysis
   * @return billingInstanceAnalysis
  **/

  public BQBillingRetrieveInputModelBillingInstanceAnalysis getBillingInstanceAnalysis() {
    return billingInstanceAnalysis;
  }

  public void setBillingInstanceAnalysis(BQBillingRetrieveInputModelBillingInstanceAnalysis billingInstanceAnalysis) {
    this.billingInstanceAnalysis = billingInstanceAnalysis;
  }


}

