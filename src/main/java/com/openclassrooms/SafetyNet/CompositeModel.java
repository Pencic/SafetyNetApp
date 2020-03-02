package com.openclassrooms.SafetyNet;

import java.util.ArrayList;
import java.util.List;

public class CompositeModel {
	
	private List<PersonsModel> persons;
	private List<FirestationModel> firestations;
	private static List<MedicalrecordsModel> medicalrecords;
	
	public CompositeModel() {
		
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

	public List<PersonsModel> getPersons() {
		return persons;
	}

	public void setPersons(List<PersonsModel> persons) {
		this.persons = persons;
	}

	public List<FirestationModel> getFirestations() {
		return firestations;
	}

	public void setFirestations(List<FirestationModel> firestations) {
		this.firestations = firestations;
	}

	public static List<MedicalrecordsModel> getMedicalrecords() {
		return medicalrecords;
	}

	public void setMedicalrecords(List<MedicalrecordsModel> medicalrecords) {
		this.medicalrecords = medicalrecords;
	}

}
