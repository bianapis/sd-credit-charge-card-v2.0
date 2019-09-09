package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis;
import org.bian.dto.BQCreditPlanRetrieveOutputModelCreditPlanInstanceRecord;
import org.bian.dto.BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRetrieveOutputModel
 */
public class BQCreditPlanRetrieveOutputModel   {
  private BQCreditPlanRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private BQCreditPlanRetrieveOutputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;

  private String creditPlanRetrieveActionTaskReference = null;

  private Object creditPlanRetrieveActionTaskRecord = null;

  private String creditPlanRetrieveActionResponse = null;

  private BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport creditPlanInstanceReport = null;

  private BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis creditPlanInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardFulfillmentArrangementInstanceRecord")
  public BQCreditPlanRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQCreditPlanRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanRetrieveOutputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanRetrieveOutputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Plan instance retrieve service call 
   * @return creditPlanRetrieveActionTaskReference
  **/

  public String getCreditPlanRetrieveActionTaskReference() {
    return creditPlanRetrieveActionTaskReference;
  }

  public void setCreditPlanRetrieveActionTaskReference(String creditPlanRetrieveActionTaskReference) {
    this.creditPlanRetrieveActionTaskReference = creditPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditPlanRetrieveActionResponse
  **/

  public String getCreditPlanRetrieveActionResponse() {
    return creditPlanRetrieveActionResponse;
  }

  public void setCreditPlanRetrieveActionResponse(String creditPlanRetrieveActionResponse) {
    this.creditPlanRetrieveActionResponse = creditPlanRetrieveActionResponse;
  }


  /**
   * Get creditPlanInstanceReport
   * @return creditPlanInstanceReport
  **/

  public BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport getCreditPlanInstanceReport() {
    return creditPlanInstanceReport;
  }

  public void setCreditPlanInstanceReport(BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport creditPlanInstanceReport) {
    this.creditPlanInstanceReport = creditPlanInstanceReport;
  }


  /**
   * Get creditPlanInstanceAnalysis
   * @return creditPlanInstanceAnalysis
  **/

  public BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis getCreditPlanInstanceAnalysis() {
    return creditPlanInstanceAnalysis;
  }

  public void setCreditPlanInstanceAnalysis(BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis creditPlanInstanceAnalysis) {
    this.creditPlanInstanceAnalysis = creditPlanInstanceAnalysis;
  }


}

