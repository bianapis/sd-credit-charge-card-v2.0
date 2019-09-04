package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule   {
  private Object statementReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The statement content 
   * @return statementReport
  **/

  public Object getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(Object statementReport) {
    this.statementReport = statementReport;
  }


}

