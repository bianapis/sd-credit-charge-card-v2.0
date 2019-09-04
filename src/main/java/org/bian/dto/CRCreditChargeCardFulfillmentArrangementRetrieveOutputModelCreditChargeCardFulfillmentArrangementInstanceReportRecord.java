package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord   {
  private String creditChargeCardFulfillmentArrangementInstanceReportData = null;

  private String creditChargeCardFulfillmentArrangementInstanceReportType = null;

  private Object creditChargeCardFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditChargeCardFulfillmentArrangementInstanceReportData
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReportData() {
    return creditChargeCardFulfillmentArrangementInstanceReportData;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportData(String creditChargeCardFulfillmentArrangementInstanceReportData) {
    this.creditChargeCardFulfillmentArrangementInstanceReportData = creditChargeCardFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditChargeCardFulfillmentArrangementInstanceReportType
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReportType() {
    return creditChargeCardFulfillmentArrangementInstanceReportType;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportType(String creditChargeCardFulfillmentArrangementInstanceReportType) {
    this.creditChargeCardFulfillmentArrangementInstanceReportType = creditChargeCardFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditChargeCardFulfillmentArrangementInstanceReport
  **/

  public Object getCreditChargeCardFulfillmentArrangementInstanceReport() {
    return creditChargeCardFulfillmentArrangementInstanceReport;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReport(Object creditChargeCardFulfillmentArrangementInstanceReport) {
    this.creditChargeCardFulfillmentArrangementInstanceReport = creditChargeCardFulfillmentArrangementInstanceReport;
  }


}

