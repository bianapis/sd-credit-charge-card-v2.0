package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveInputModel
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveInputModel   {
  private Object creditChargeCardFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String creditChargeCardFulfillmentArrangementRetrieveActionRequest = null;

  private CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord creditChargeCardFulfillmentArrangementInstanceReportRecord = null;

  private CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis creditChargeCardFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditChargeCardFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCreditChargeCardFulfillmentArrangementRetrieveActionRequest() {
    return creditChargeCardFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCreditChargeCardFulfillmentArrangementRetrieveActionRequest(String creditChargeCardFulfillmentArrangementRetrieveActionRequest) {
    this.creditChargeCardFulfillmentArrangementRetrieveActionRequest = creditChargeCardFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get creditChargeCardFulfillmentArrangementInstanceReportRecord
   * @return creditChargeCardFulfillmentArrangementInstanceReportRecord
  **/

  public CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord getCreditChargeCardFulfillmentArrangementInstanceReportRecord() {
    return creditChargeCardFulfillmentArrangementInstanceReportRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportRecord(CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord creditChargeCardFulfillmentArrangementInstanceReportRecord) {
    this.creditChargeCardFulfillmentArrangementInstanceReportRecord = creditChargeCardFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get creditChargeCardFulfillmentArrangementInstanceAnalysis
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysis
  **/

  public CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis getCreditChargeCardFulfillmentArrangementInstanceAnalysis() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysis;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysis(CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis creditChargeCardFulfillmentArrangementInstanceAnalysis) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysis = creditChargeCardFulfillmentArrangementInstanceAnalysis;
  }


}

