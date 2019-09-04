package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingUpdateInputModelBillingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBillingUpdateOutputModel
 */
public class BQBillingUpdateOutputModel   {
  private BQBillingUpdateInputModelBillingInstanceRecord billingInstanceRecord = null;

  private String billingUpdateActionTaskReference = null;

  private Object billingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get billingInstanceRecord
   * @return billingInstanceRecord
  **/

  public BQBillingUpdateInputModelBillingInstanceRecord getBillingInstanceRecord() {
    return billingInstanceRecord;
  }

  public void setBillingInstanceRecord(BQBillingUpdateInputModelBillingInstanceRecord billingInstanceRecord) {
    this.billingInstanceRecord = billingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return billingUpdateActionTaskReference
  **/

  public String getBillingUpdateActionTaskReference() {
    return billingUpdateActionTaskReference;
  }

  public void setBillingUpdateActionTaskReference(String billingUpdateActionTaskReference) {
    this.billingUpdateActionTaskReference = billingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return billingUpdateActionTaskRecord
  **/

  public Object getBillingUpdateActionTaskRecord() {
    return billingUpdateActionTaskRecord;
  }

  public void setBillingUpdateActionTaskRecord(Object billingUpdateActionTaskRecord) {
    this.billingUpdateActionTaskRecord = billingUpdateActionTaskRecord;
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

