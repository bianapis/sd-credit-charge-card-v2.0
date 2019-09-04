package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesUpdateInputModel
 */
public class BQServiceFeesUpdateInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private Object serviceFeesUpdateActionTaskRecord = null;

  private String serviceFeesUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return serviceFeesUpdateActionTaskRecord
  **/

  public Object getServiceFeesUpdateActionTaskRecord() {
    return serviceFeesUpdateActionTaskRecord;
  }

  public void setServiceFeesUpdateActionTaskRecord(Object serviceFeesUpdateActionTaskRecord) {
    this.serviceFeesUpdateActionTaskRecord = serviceFeesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return serviceFeesUpdateActionRequest
  **/

  public String getServiceFeesUpdateActionRequest() {
    return serviceFeesUpdateActionRequest;
  }

  public void setServiceFeesUpdateActionRequest(String serviceFeesUpdateActionRequest) {
    this.serviceFeesUpdateActionRequest = serviceFeesUpdateActionRequest;
  }


}

