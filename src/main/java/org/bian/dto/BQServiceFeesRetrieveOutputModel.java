package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModel
 */
public class BQServiceFeesRetrieveOutputModel   {
  private BQServiceFeesRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private String serviceFeesRetrieveActionTaskReference = null;

  private Object serviceFeesRetrieveActionTaskRecord = null;

  private String serviceFeesRetrieveActionResponse = null;

  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReport = null;

  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public BQServiceFeesRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQServiceFeesRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesUpdateInputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesUpdateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance retrieve service call 
   * @return serviceFeesRetrieveActionTaskReference
  **/

  public String getServiceFeesRetrieveActionTaskReference() {
    return serviceFeesRetrieveActionTaskReference;
  }

  public void setServiceFeesRetrieveActionTaskReference(String serviceFeesRetrieveActionTaskReference) {
    this.serviceFeesRetrieveActionTaskReference = serviceFeesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceFeesRetrieveActionTaskRecord
  **/

  public Object getServiceFeesRetrieveActionTaskRecord() {
    return serviceFeesRetrieveActionTaskRecord;
  }

  public void setServiceFeesRetrieveActionTaskRecord(Object serviceFeesRetrieveActionTaskRecord) {
    this.serviceFeesRetrieveActionTaskRecord = serviceFeesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceFeesRetrieveActionResponse
  **/

  public String getServiceFeesRetrieveActionResponse() {
    return serviceFeesRetrieveActionResponse;
  }

  public void setServiceFeesRetrieveActionResponse(String serviceFeesRetrieveActionResponse) {
    this.serviceFeesRetrieveActionResponse = serviceFeesRetrieveActionResponse;
  }


  /**
   * Get serviceFeesInstanceReport
   * @return serviceFeesInstanceReport
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }


  /**
   * Get serviceFeesInstanceAnalysis
   * @return serviceFeesInstanceAnalysis
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis getServiceFeesInstanceAnalysis() {
    return serviceFeesInstanceAnalysis;
  }

  public void setServiceFeesInstanceAnalysis(BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis) {
    this.serviceFeesInstanceAnalysis = serviceFeesInstanceAnalysis;
  }


}

