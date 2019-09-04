package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementUpdateInputModel
 */
public class CRCreditChargeCardFulfillmentArrangementUpdateInputModel   {
  private String creditChargeCardServicingSessionReference = null;

  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private Object creditChargeCardFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return creditChargeCardServicingSessionReference
  **/

  public String getCreditChargeCardServicingSessionReference() {
    return creditChargeCardServicingSessionReference;
  }

  public void setCreditChargeCardServicingSessionReference(String creditChargeCardServicingSessionReference) {
    this.creditChargeCardServicingSessionReference = creditChargeCardServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditChargeCardFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCreditChargeCardFulfillmentArrangementUpdateActionTaskRecord() {
    return creditChargeCardFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementUpdateActionTaskRecord(Object creditChargeCardFulfillmentArrangementUpdateActionTaskRecord) {
    this.creditChargeCardFulfillmentArrangementUpdateActionTaskRecord = creditChargeCardFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

