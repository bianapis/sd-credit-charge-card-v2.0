/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CreditChargeCardApiServiceImpl implements CreditChargeCardApiService {

	public SDCreditChargeCardActivateOutputModel activate(SDCreditChargeCardActivateInputModel request){
		return JsonReader.read("activate-SDCreditChargeCardActivateOutputModel.json",new TypeReference<SDCreditChargeCardActivateOutputModel>(){});
	}
	
	public SDCreditChargeCardConfigureOutputModel configure(String sdReferenceId, SDCreditChargeCardConfigureInputModel request){
		return JsonReader.read("configure-SDCreditChargeCardConfigureOutputModel.json",new TypeReference<SDCreditChargeCardConfigureOutputModel>(){});
	}
	
	public CRCreditChargeCardFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditChargeCardFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCreditChargeCardFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCreditChargeCardFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQCardTransactionExchangeOutputModel exchangeCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionExchangeInputModel request){
		return JsonReader.read("exchange-BQCardTransactionExchangeOutputModel.json",new TypeReference<BQCardTransactionExchangeOutputModel>(){});
	}
	
	public BQIssuedDeviceExchangeOutputModel exchangeIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceExchangeInputModel request){
		return JsonReader.read("exchange-BQIssuedDeviceExchangeOutputModel.json",new TypeReference<BQIssuedDeviceExchangeOutputModel>(){});
	}
	
	public BQBillingExecuteOutputModel executeBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingExecuteInputModel request){
		return JsonReader.read("execute-BQBillingExecuteOutputModel.json",new TypeReference<BQBillingExecuteOutputModel>(){});
	}
	
	public BQCardTransactionExecuteOutputModel executeCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionExecuteInputModel request){
		return JsonReader.read("execute-BQCardTransactionExecuteOutputModel.json",new TypeReference<BQCardTransactionExecuteOutputModel>(){});
	}
	
	public BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request){
		return JsonReader.read("execute-BQRepaymentExecuteOutputModel.json",new TypeReference<BQRepaymentExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCreditChargeCardFeedbackOutputModel feedback(String sdReferenceId, SDCreditChargeCardFeedbackInputModel request){
		return JsonReader.read("feedback-SDCreditChargeCardFeedbackOutputModel.json",new TypeReference<SDCreditChargeCardFeedbackOutputModel>(){});
	}
	
	public CRCreditChargeCardFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCreditChargeCardFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCreditChargeCardFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCreditChargeCardFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQCreditPlanInitiateOutputModel initiateCreditplan(String sdReferenceId, String crReferenceId, BQCreditPlanInitiateInputModel request){
		return JsonReader.read("initiate-BQCreditPlanInitiateOutputModel.json",new TypeReference<BQCreditPlanInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQCreditPlanRequestOutputModel requestCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditPlanRequestInputModel request){
		return JsonReader.read("request-BQCreditPlanRequestOutputModel.json",new TypeReference<BQCreditPlanRequestOutputModel>(){});
	}
	
	public BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request){
		return JsonReader.read("request-BQIssuedDeviceRequestOutputModel.json",new TypeReference<BQIssuedDeviceRequestOutputModel>(){});
	}
	
	public CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBillingRetrieveOutputModel retrieveBilling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBillingRetrieveOutputModel.json",new TypeReference<BQBillingRetrieveOutputModel>(){});
	}
	
	public BQCardTransactionRetrieveOutputModel retrieveCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCardTransactionRetrieveOutputModel.json",new TypeReference<BQCardTransactionRetrieveOutputModel>(){});
	}
	
	public BQCreditPlanRetrieveOutputModel retrieveCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCreditPlanRetrieveOutputModel.json",new TypeReference<BQCreditPlanRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepaymentRetrieveOutputModel.json",new TypeReference<BQRepaymentRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCreditChargeCardRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCreditChargeCardRetrieveOutputModel.json",new TypeReference<SDCreditChargeCardRetrieveOutputModel>(){});
	}
	
	public CRCreditChargeCardFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditChargeCardFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCreditChargeCardFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCreditChargeCardFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQBillingUpdateOutputModel updateBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingUpdateInputModel request){
		return JsonReader.read("update-BQBillingUpdateOutputModel.json",new TypeReference<BQBillingUpdateOutputModel>(){});
	}
	
	public BQCardTransactionUpdateOutputModel updateCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionUpdateInputModel request){
		return JsonReader.read("update-BQCardTransactionUpdateOutputModel.json",new TypeReference<BQCardTransactionUpdateOutputModel>(){});
	}
	
	public BQCreditPlanUpdateOutputModel updateCreditplan(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditPlanUpdateInputModel request){
		return JsonReader.read("update-BQCreditPlanUpdateOutputModel.json",new TypeReference<BQCreditPlanUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request){
		return JsonReader.read("update-BQRepaymentUpdateOutputModel.json",new TypeReference<BQRepaymentUpdateOutputModel>(){});
	}
	
	public BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request){
		return JsonReader.read("update-BQServiceFeesUpdateOutputModel.json",new TypeReference<BQServiceFeesUpdateOutputModel>(){});
	}
	
}
