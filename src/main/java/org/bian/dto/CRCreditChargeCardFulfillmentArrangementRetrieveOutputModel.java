package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel   {
  private CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private String creditChargeCardFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String creditChargeCardFulfillmentArrangementRetrieveActionResponse = null;

  private CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord creditChargeCardFulfillmentArrangementInstanceReportRecord = null;

  private CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis creditChargeCardFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Fulfillment Arrangement instance retrieve service call 
   * @return creditChargeCardFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCreditChargeCardFulfillmentArrangementRetrieveActionTaskReference() {
    return creditChargeCardFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCreditChargeCardFulfillmentArrangementRetrieveActionTaskReference(String creditChargeCardFulfillmentArrangementRetrieveActionTaskReference) {
    this.creditChargeCardFulfillmentArrangementRetrieveActionTaskReference = creditChargeCardFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCreditChargeCardFulfillmentArrangementRetrieveActionTaskRecord() {
    return creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementRetrieveActionTaskRecord(Object creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord) {
    this.creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord = creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditChargeCardFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCreditChargeCardFulfillmentArrangementRetrieveActionResponse() {
    return creditChargeCardFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCreditChargeCardFulfillmentArrangementRetrieveActionResponse(String creditChargeCardFulfillmentArrangementRetrieveActionResponse) {
    this.creditChargeCardFulfillmentArrangementRetrieveActionResponse = creditChargeCardFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get creditChargeCardFulfillmentArrangementInstanceReportRecord
   * @return creditChargeCardFulfillmentArrangementInstanceReportRecord
  **/

  public CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord getCreditChargeCardFulfillmentArrangementInstanceReportRecord() {
    return creditChargeCardFulfillmentArrangementInstanceReportRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportRecord(CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord creditChargeCardFulfillmentArrangementInstanceReportRecord) {
    this.creditChargeCardFulfillmentArrangementInstanceReportRecord = creditChargeCardFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get creditChargeCardFulfillmentArrangementInstanceAnalysis
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysis
  **/

  public CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis getCreditChargeCardFulfillmentArrangementInstanceAnalysis() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysis;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysis(CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis creditChargeCardFulfillmentArrangementInstanceAnalysis) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysis = creditChargeCardFulfillmentArrangementInstanceAnalysis;
  }


}

