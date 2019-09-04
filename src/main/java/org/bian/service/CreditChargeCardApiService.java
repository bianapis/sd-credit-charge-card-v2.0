/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditChargeCardApiService {

	SDCreditChargeCardActivateOutputModel activate(SDCreditChargeCardActivateInputModel request);
	
	SDCreditChargeCardConfigureOutputModel configure(String sdReferenceId, SDCreditChargeCardConfigureInputModel request);
	
	CRCreditChargeCardFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditChargeCardFulfillmentArrangementControlInputModel request);
	
	BQCardTransactionExchangeOutputModel exchangeCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionExchangeInputModel request);
	
	BQIssuedDeviceExchangeOutputModel exchangeIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceExchangeInputModel request);
	
	BQBillingExecuteOutputModel executeBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingExecuteInputModel request);
	
	BQCardTransactionExecuteOutputModel executeCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionExecuteInputModel request);
	
	BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDCreditChargeCardFeedbackOutputModel feedback(String sdReferenceId, SDCreditChargeCardFeedbackInputModel request);
	
	CRCreditChargeCardFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCreditChargeCardFulfillmentArrangementInitiateInputModel request);
	
	BQCreditPlanInitiateOutputModel initiateCreditplan(String sdReferenceId, String crReferenceId, BQCreditPlanInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQCreditPlanRequestOutputModel requestCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditPlanRequestInputModel request);
	
	BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request);
	
	CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBillingRetrieveOutputModel retrieveBilling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCardTransactionRetrieveOutputModel retrieveCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCreditPlanRetrieveOutputModel retrieveCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCreditChargeCardRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditChargeCardFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditChargeCardFulfillmentArrangementUpdateInputModel request);
	
	BQBillingUpdateOutputModel updateBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingUpdateInputModel request);
	
	BQCardTransactionUpdateOutputModel updateCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionUpdateInputModel request);
	
	BQCreditPlanUpdateOutputModel updateCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditPlanUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request);
	
	BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request);
	
}
