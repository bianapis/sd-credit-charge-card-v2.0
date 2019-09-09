package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis;
import org.bian.dto.BQRepaymentRetrieveOutputModelRepaymentInstanceRecord;
import org.bian.dto.BQRepaymentRetrieveOutputModelRepaymentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModel
 */
public class BQRepaymentRetrieveOutputModel   {
  private BQRepaymentRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private BQRepaymentRetrieveOutputModelRepaymentInstanceRecord repaymentInstanceRecord = null;

  private String repaymentRetrieveActionTaskReference = null;

  private Object repaymentRetrieveActionTaskRecord = null;

  private String repaymentRetrieveActionResponse = null;

  private BQRepaymentRetrieveOutputModelRepaymentInstanceReport repaymentInstanceReport = null;

  private BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis repaymentInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardFulfillmentArrangementInstanceRecord")
  public BQRepaymentRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQRepaymentRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get repaymentInstanceRecord
   * @return repaymentInstanceRecord
  **/

  public BQRepaymentRetrieveOutputModelRepaymentInstanceRecord getRepaymentInstanceRecord() {
    return repaymentInstanceRecord;
  }

  public void setRepaymentInstanceRecord(BQRepaymentRetrieveOutputModelRepaymentInstanceRecord repaymentInstanceRecord) {
    this.repaymentInstanceRecord = repaymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Repayment instance retrieve service call 
   * @return repaymentRetrieveActionTaskReference
  **/

  public String getRepaymentRetrieveActionTaskReference() {
    return repaymentRetrieveActionTaskReference;
  }

  public void setRepaymentRetrieveActionTaskReference(String repaymentRetrieveActionTaskReference) {
    this.repaymentRetrieveActionTaskReference = repaymentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return repaymentRetrieveActionTaskRecord
  **/

  public Object getRepaymentRetrieveActionTaskRecord() {
    return repaymentRetrieveActionTaskRecord;
  }

  public void setRepaymentRetrieveActionTaskRecord(Object repaymentRetrieveActionTaskRecord) {
    this.repaymentRetrieveActionTaskRecord = repaymentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return repaymentRetrieveActionResponse
  **/

  public String getRepaymentRetrieveActionResponse() {
    return repaymentRetrieveActionResponse;
  }

  public void setRepaymentRetrieveActionResponse(String repaymentRetrieveActionResponse) {
    this.repaymentRetrieveActionResponse = repaymentRetrieveActionResponse;
  }


  /**
   * Get repaymentInstanceReport
   * @return repaymentInstanceReport
  **/

  public BQRepaymentRetrieveOutputModelRepaymentInstanceReport getRepaymentInstanceReport() {
    return repaymentInstanceReport;
  }

  public void setRepaymentInstanceReport(BQRepaymentRetrieveOutputModelRepaymentInstanceReport repaymentInstanceReport) {
    this.repaymentInstanceReport = repaymentInstanceReport;
  }


  /**
   * Get repaymentInstanceAnalysis
   * @return repaymentInstanceAnalysis
  **/

  public BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis getRepaymentInstanceAnalysis() {
    return repaymentInstanceAnalysis;
  }

  public void setRepaymentInstanceAnalysis(BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis repaymentInstanceAnalysis) {
    this.repaymentInstanceAnalysis = repaymentInstanceAnalysis;
  }


}

