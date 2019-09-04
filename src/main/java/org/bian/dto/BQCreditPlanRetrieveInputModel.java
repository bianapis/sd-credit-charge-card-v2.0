package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanRetrieveInputModelCreditPlanInstanceAnalysis;
import org.bian.dto.BQCreditPlanRetrieveInputModelCreditPlanInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRetrieveInputModel
 */
public class BQCreditPlanRetrieveInputModel   {
  private Object creditPlanRetrieveActionTaskRecord = null;

  private String creditPlanRetrieveActionRequest = null;

  private BQCreditPlanRetrieveInputModelCreditPlanInstanceReport creditPlanInstanceReport = null;

  private BQCreditPlanRetrieveInputModelCreditPlanInstanceAnalysis creditPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditPlanRetrieveActionTaskRecord
  **/

  public Object getCreditPlanRetrieveActionTaskRecord() {
    return creditPlanRetrieveActionTaskRecord;
  }

  public void setCreditPlanRetrieveActionTaskRecord(Object creditPlanRetrieveActionTaskRecord) {
    this.creditPlanRetrieveActionTaskRecord = creditPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditPlanRetrieveActionRequest
  **/

  public String getCreditPlanRetrieveActionRequest() {
    return creditPlanRetrieveActionRequest;
  }

  public void setCreditPlanRetrieveActionRequest(String creditPlanRetrieveActionRequest) {
    this.creditPlanRetrieveActionRequest = creditPlanRetrieveActionRequest;
  }


  /**
   * Get creditPlanInstanceReport
   * @return creditPlanInstanceReport
  **/

  public BQCreditPlanRetrieveInputModelCreditPlanInstanceReport getCreditPlanInstanceReport() {
    return creditPlanInstanceReport;
  }

  public void setCreditPlanInstanceReport(BQCreditPlanRetrieveInputModelCreditPlanInstanceReport creditPlanInstanceReport) {
    this.creditPlanInstanceReport = creditPlanInstanceReport;
  }


  /**
   * Get creditPlanInstanceAnalysis
   * @return creditPlanInstanceAnalysis
  **/

  public BQCreditPlanRetrieveInputModelCreditPlanInstanceAnalysis getCreditPlanInstanceAnalysis() {
    return creditPlanInstanceAnalysis;
  }

  public void setCreditPlanInstanceAnalysis(BQCreditPlanRetrieveInputModelCreditPlanInstanceAnalysis creditPlanInstanceAnalysis) {
    this.creditPlanInstanceAnalysis = creditPlanInstanceAnalysis;
  }


}

