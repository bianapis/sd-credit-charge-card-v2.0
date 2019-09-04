package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanRequestInputModelCreditPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRequestOutputModel
 */
public class BQCreditPlanRequestOutputModel   {
  private BQCreditPlanRequestInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;

  private String creditPlanRequestActionTaskReference = null;

  private Object creditPlanRequestActionTaskRecord = null;

  private String creditPlanRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanRequestInputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanRequestInputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Plan instance request service call 
   * @return creditPlanRequestActionTaskReference
  **/

  public String getCreditPlanRequestActionTaskReference() {
    return creditPlanRequestActionTaskReference;
  }

  public void setCreditPlanRequestActionTaskReference(String creditPlanRequestActionTaskReference) {
    this.creditPlanRequestActionTaskReference = creditPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditPlanRequestActionTaskRecord
  **/

  public Object getCreditPlanRequestActionTaskRecord() {
    return creditPlanRequestActionTaskRecord;
  }

  public void setCreditPlanRequestActionTaskRecord(Object creditPlanRequestActionTaskRecord) {
    this.creditPlanRequestActionTaskRecord = creditPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Plan service request record 
   * @return creditPlanRequestRecordReference
  **/

  public String getCreditPlanRequestRecordReference() {
    return creditPlanRequestRecordReference;
  }

  public void setCreditPlanRequestRecordReference(String creditPlanRequestRecordReference) {
    this.creditPlanRequestRecordReference = creditPlanRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

