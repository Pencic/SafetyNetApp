package com.openclassrooms.SafetyNet;

import java.util.ArrayList;
import java.util.List;

public class CompositeModel {
	
	private static List<PersonsModel> persons;
	private static List<FirestationModel> firestations;
	private static List<MedicalrecordsModel> medicalrecords;
	
	public CompositeModel() {
		
	}
	
	public List<ChildPersonsModel> getChildrenForAddress(String address){
		
		return
			ChildPersonsModel.fromPersonsModelToChildPersonsModel(
				PersonsModel.filterChildren(
					PersonsModel.getPersonsForAddress(getPersons() , address)));		
	}
	
	public List<String> getPhoneNumbersForFirestationJuristiction(int firestationNumber){
		
		for(FirestationModel firestation : firestations ) {
			if(firestation.getStation() == firestationNumber) {
				return firestation.getPhoneNumbersForThisJuristiction();
			}
		}
		return null;
		
	}
	
	
	public List<String> getAddressesForStation(int station) {
		
		if(getFirestations() == null)
			return null;
		List<String> result = new ArrayList<String>();
		
		FirestationModel[] firestationModels = new FirestationModel[getFirestations().size()];
		
		for(int i = 0 ; i < getFirestations().size(); i ++) {
			FirestationModel model = getFirestations().toArray(firestationModels)[i];
			if (model.getStation() == station) {
				result.add(model.getAddress());
		    }
	    }
		return result;		
	}

	public static List<PersonsModel> getPersons() {
		return persons;
	}

	public void setPersons(List<PersonsModel> persons) {
		CompositeModel.persons = persons;
	}

	public List<FirestationModel> getFirestations() {
		return firestations;
	}

	public void setFirestations(List<FirestationModel> firestations) {
		CompositeModel.firestations = firestations;
	}

	public static List<MedicalrecordsModel> getMedicalrecords() {
		return medicalrecords;
	}

	public void setMedicalrecords(List<MedicalrecordsModel> medicalrecords) {
		CompositeModel.medicalrecords = medicalrecords;
	}

}
