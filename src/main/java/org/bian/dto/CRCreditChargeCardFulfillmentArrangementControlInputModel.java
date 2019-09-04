package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementControlInputModelCreditChargeCardFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementControlInputModel
 */
public class CRCreditChargeCardFulfillmentArrangementControlInputModel   {
  private String creditChargeCardServicingSessionReference = null;

  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private Object creditChargeCardFulfillmentArrangementControlActionTaskRecord = null;

  private CRCreditChargeCardFulfillmentArrangementControlInputModelCreditChargeCardFulfillmentArrangementControlActionRequest creditChargeCardFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return creditChargeCardFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCreditChargeCardFulfillmentArrangementControlActionTaskRecord() {
    return creditChargeCardFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementControlActionTaskRecord(Object creditChargeCardFulfillmentArrangementControlActionTaskRecord) {
    this.creditChargeCardFulfillmentArrangementControlActionTaskRecord = creditChargeCardFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get creditChargeCardFulfillmentArrangementControlActionRequest
   * @return creditChargeCardFulfillmentArrangementControlActionRequest
  **/

  public CRCreditChargeCardFulfillmentArrangementControlInputModelCreditChargeCardFulfillmentArrangementControlActionRequest getCreditChargeCardFulfillmentArrangementControlActionRequest() {
    return creditChargeCardFulfillmentArrangementControlActionRequest;
  }

  public void setCreditChargeCardFulfillmentArrangementControlActionRequest(CRCreditChargeCardFulfillmentArrangementControlInputModelCreditChargeCardFulfillmentArrangementControlActionRequest creditChargeCardFulfillmentArrangementControlActionRequest) {
    this.creditChargeCardFulfillmentArrangementControlActionRequest = creditChargeCardFulfillmentArrangementControlActionRequest;
  }


}

