package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementUpdateOutputModel
 */
public class CRCreditChargeCardFulfillmentArrangementUpdateOutputModel   {
  private CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private String creditChargeCardFulfillmentArrangementUpdateActionTaskReference = null;

  private Object creditChargeCardFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardFulfillmentArrangementInstanceRecord")
  public CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditChargeCardFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCreditChargeCardFulfillmentArrangementUpdateActionTaskReference() {
    return creditChargeCardFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCreditChargeCardFulfillmentArrangementUpdateActionTaskReference(String creditChargeCardFulfillmentArrangementUpdateActionTaskReference) {
    this.creditChargeCardFulfillmentArrangementUpdateActionTaskReference = creditChargeCardFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

