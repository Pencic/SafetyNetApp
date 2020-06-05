package com.openclassrooms.SafetyNet;

import java.util.ArrayList;
import java.util.List;

public class FirestationModel {
	
	private String address;
	private int station;
	
	public FirestationModel() {
		
	}
	
	public List<String> getPhoneNumbersForThisJuristiction(){
		
		List<String> result = new ArrayList<String>();
		
		for(PersonsModel person : getPersonsAtAddress()) {
			result.add(person.getPhone());
		}
		return result;
		
	}
	
	public List<PersonsModel> getPersonsAtAddress(){
		
		List<PersonsModel> result = new ArrayList<PersonsModel>();
		
		List<PersonsModel> allPersons = CompositeModel.getPersons();	
	
		for(PersonsModel personModel : allPersons) {			
			if (personModel.getAddress() == this.getAddress()) {
				result.add(personModel);				
			}
		}
		return result;
	}
		
	
	
	public List<PersonsModel> getChildrenAtAddress(){
	
		List<PersonsModel> result = new ArrayList<PersonsModel>();
		
		List<PersonsModel> allPersons = CompositeModel.getPersons();	
	
		for(PersonsModel personModel : allPersons) {			
			if (personModel.getAddress() == this.getAddress() && personModel.getAge() < 18) {
				result.add(personModel);				
			}
		}
		return result;
	}
	
	
	public List<PersonsModel> getPersons(){
		
		return CompositeModel.getPersons();
	}
	
	
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

}
