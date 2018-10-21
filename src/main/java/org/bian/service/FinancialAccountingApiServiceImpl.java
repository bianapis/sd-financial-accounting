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
public class FinancialAccountingApiServiceImpl implements FinancialAccountingApiService {

	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RecordFinancialAccountResponse recordBookings(String crReferenceId, String bqReferenceId, BookingBase request){
		return JsonReader.read("record-RecordFinancialAccountResponse.json",new TypeReference<RecordFinancialAccountResponse>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RetrieveFinancialBookingLogResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveFinancialBookingLogResponse.json",new TypeReference<RetrieveFinancialBookingLogResponse>(){});
	}
	
	public BookingBaseWithIdAndRoot retrieveBookings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BookingBaseWithIdAndRoot.json",new TypeReference<BookingBaseWithIdAndRoot>(){});
	}
	
	public ReportingBaseWithIdAndRoot retrieveReporting(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithIdAndRoot.json",new TypeReference<ReportingBaseWithIdAndRoot>(){});
	}
	
	public UpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UpdateBaseWithIdAndRoot.json",new TypeReference<UpdateBaseWithIdAndRoot>(){});
	}
	
	public UpdateBaseWithIdAndRoot updateUpdates(String crReferenceId, String bqReferenceId, UpdateBase request){
		return JsonReader.read("update-UpdateBaseWithIdAndRoot.json",new TypeReference<UpdateBaseWithIdAndRoot>(){});
	}
	
}
