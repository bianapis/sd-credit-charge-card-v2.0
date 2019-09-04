package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanUpdateInputModelCreditPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditPlanUpdateOutputModel
 */
public class BQCreditPlanUpdateOutputModel   {
  private BQCreditPlanUpdateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;

  private String creditPlanUpdateActionTaskReference = null;

  private Object creditPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanUpdateInputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanUpdateInputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditPlanUpdateActionTaskReference
  **/

  public String getCreditPlanUpdateActionTaskReference() {
    return creditPlanUpdateActionTaskReference;
  }

  public void setCreditPlanUpdateActionTaskReference(String creditPlanUpdateActionTaskReference) {
    this.creditPlanUpdateActionTaskReference = creditPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditPlanUpdateActionTaskRecord
  **/

  public Object getCreditPlanUpdateActionTaskRecord() {
    return creditPlanUpdateActionTaskRecord;
  }

  public void setCreditPlanUpdateActionTaskRecord(Object creditPlanUpdateActionTaskRecord) {
    this.creditPlanUpdateActionTaskRecord = creditPlanUpdateActionTaskRecord;
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

