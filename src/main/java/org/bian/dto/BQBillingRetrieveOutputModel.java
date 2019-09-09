package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceAnalysis;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceRecord;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceReport;
import org.bian.dto.BQBillingRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQBillingRetrieveOutputModelInterestInstanceRecord;
import org.bian.dto.BQBillingRetrieveOutputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModel
 */
public class BQBillingRetrieveOutputModel   {
  private BQBillingRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private BQBillingRetrieveOutputModelInterestInstanceRecord interestInstanceRecord = null;

  private BQBillingRetrieveOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private BQBillingRetrieveOutputModelBillingInstanceRecord billingInstanceRecord = null;

  private String billingRetrieveActionTaskReference = null;

  private Object billingRetrieveActionTaskRecord = null;

  private String billingRetrieveActionResponse = null;

  private BQBillingRetrieveOutputModelBillingInstanceReport billingInstanceReport = null;

  private BQBillingRetrieveOutputModelBillingInstanceAnalysis billingInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardFulfillmentArrangementInstanceRecord")
  public BQBillingRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQBillingRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get interestInstanceRecord
   * @return interestInstanceRecord
  **/

  public BQBillingRetrieveOutputModelInterestInstanceRecord getInterestInstanceRecord() {
    return interestInstanceRecord;
  }

  public void setInterestInstanceRecord(BQBillingRetrieveOutputModelInterestInstanceRecord interestInstanceRecord) {
    this.interestInstanceRecord = interestInstanceRecord;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQBillingRetrieveOutputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQBillingRetrieveOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * Get billingInstanceRecord
   * @return billingInstanceRecord
  **/

  public BQBillingRetrieveOutputModelBillingInstanceRecord getBillingInstanceRecord() {
    return billingInstanceRecord;
  }

  public void setBillingInstanceRecord(BQBillingRetrieveOutputModelBillingInstanceRecord billingInstanceRecord) {
    this.billingInstanceRecord = billingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Billing instance retrieve service call 
   * @return billingRetrieveActionTaskReference
  **/

  public String getBillingRetrieveActionTaskReference() {
    return billingRetrieveActionTaskReference;
  }

  public void setBillingRetrieveActionTaskReference(String billingRetrieveActionTaskReference) {
    this.billingRetrieveActionTaskReference = billingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return billingRetrieveActionResponse
  **/

  public String getBillingRetrieveActionResponse() {
    return billingRetrieveActionResponse;
  }

  public void setBillingRetrieveActionResponse(String billingRetrieveActionResponse) {
    this.billingRetrieveActionResponse = billingRetrieveActionResponse;
  }


  /**
   * Get billingInstanceReport
   * @return billingInstanceReport
  **/

  public BQBillingRetrieveOutputModelBillingInstanceReport getBillingInstanceReport() {
    return billingInstanceReport;
  }

  public void setBillingInstanceReport(BQBillingRetrieveOutputModelBillingInstanceReport billingInstanceReport) {
    this.billingInstanceReport = billingInstanceReport;
  }


  /**
   * Get billingInstanceAnalysis
   * @return billingInstanceAnalysis
  **/

  public BQBillingRetrieveOutputModelBillingInstanceAnalysis getBillingInstanceAnalysis() {
    return billingInstanceAnalysis;
  }

  public void setBillingInstanceAnalysis(BQBillingRetrieveOutputModelBillingInstanceAnalysis billingInstanceAnalysis) {
    this.billingInstanceAnalysis = billingInstanceAnalysis;
  }


}

