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
public class ContactCenterOperationsApiServiceImpl implements ContactCenterOperationsApiService {

	public SDContactCenterOperationsActivateOutputModel activate(SDContactCenterOperationsActivateInputModel request){
		return JsonReader.read("activate-SDContactCenterOperationsActivateOutputModel.json",new TypeReference<SDContactCenterOperationsActivateOutputModel>(){});
	}
	
	public SDContactCenterOperationsConfigureOutputModel configure(String sdReferenceId, SDContactCenterOperationsConfigureInputModel request){
		return JsonReader.read("configure-SDContactCenterOperationsConfigureOutputModel.json",new TypeReference<SDContactCenterOperationsConfigureOutputModel>(){});
	}
	
	public BQAssignmentControlOutputModel controlAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentControlInputModel request){
		return JsonReader.read("control-BQAssignmentControlOutputModel.json",new TypeReference<BQAssignmentControlOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRContactCenterAdministrativePlanControlOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanControlOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanCreateOutputModel create(String sdReferenceId, CRContactCenterAdministrativePlanCreateInputModel request){
		return JsonReader.read("create-CRContactCenterAdministrativePlanCreateOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanCreateOutputModel>(){});
	}
	
	public BQAssignmentCreateOutputModel createAssignment(String sdReferenceId, String crReferenceId, BQAssignmentCreateInputModel request){
		return JsonReader.read("create-BQAssignmentCreateOutputModel.json",new TypeReference<BQAssignmentCreateOutputModel>(){});
	}
	
	public BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request){
		return JsonReader.read("create-BQTroubleshootingCreateOutputModel.json",new TypeReference<BQTroubleshootingCreateOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanExecuteInputModel request){
		return JsonReader.read("execute-CRContactCenterAdministrativePlanExecuteOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanExecuteOutputModel>(){});
	}
	
	public SDContactCenterOperationsFeedbackOutputModel feedback(String sdReferenceId, SDContactCenterOperationsFeedbackInputModel request){
		return JsonReader.read("feedback-SDContactCenterOperationsFeedbackOutputModel.json",new TypeReference<SDContactCenterOperationsFeedbackOutputModel>(){});
	}
	
	public BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request){
		return JsonReader.read("request-BQAssignmentRequestOutputModel.json",new TypeReference<BQAssignmentRequestOutputModel>(){});
	}
	
	public BQPeakLoadRequestOutputModel requestPeakload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPeakLoadRequestInputModel request){
		return JsonReader.read("request-BQPeakLoadRequestOutputModel.json",new TypeReference<BQPeakLoadRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRContactCenterAdministrativePlanRequestOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanRequestOutputModel>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public BQPeakLoadRetrieveOutputModel retrievePeakload(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPeakLoadRetrieveOutputModel.json",new TypeReference<BQPeakLoadRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRContactCenterAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDContactCenterOperationsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDContactCenterOperationsRetrieveOutputModel.json",new TypeReference<SDContactCenterOperationsRetrieveOutputModel>(){});
	}
	
	public CRContactCenterAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRContactCenterAdministrativePlanUpdateOutputModel.json",new TypeReference<CRContactCenterAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQAssignmentUpdateOutputModel.json",new TypeReference<BQAssignmentUpdateOutputModel>(){});
	}
	
	public BQPeakLoadUpdateOutputModel updatePeakload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPeakLoadUpdateInputModel request){
		return JsonReader.read("update-BQPeakLoadUpdateOutputModel.json",new TypeReference<BQPeakLoadUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
