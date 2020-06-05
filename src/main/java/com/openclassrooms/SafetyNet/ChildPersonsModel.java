package com.openclassrooms.SafetyNet;

import java.util.ArrayList;
import java.util.List;

public class ChildPersonsModel extends PersonsModel {
	
		
	public List<PersonsModel> personsLivingAtSameAddress;
	
	public ChildPersonsModel(PersonsModel fromPerson) {
		
		this.setFirstName(fromPerson.getFirstName());
		this.setLastName(fromPerson.getLastName());
		findPersonsAtSameAddress(CompositeModel.getPersons());
	}
	
	public static List<ChildPersonsModel> fromPersonsModelToChildPersonsModel(List<PersonsModel> persons){
		
		List<ChildPersonsModel> result = new ArrayList<ChildPersonsModel>();
		
		for(PersonsModel person : persons) {
			result.add(new ChildPersonsModel(person));
		}
		return result;		
	}
			
	private void findPersonsAtSameAddress(List<PersonsModel> allPersons) {
		
		personsLivingAtSameAddress = new ArrayList<PersonsModel>();
		
		for(PersonsModel person : allPersons) {
			if(person.getAddress() == this.getAddress()) {
				personsLivingAtSameAddress.add(person);
			}
		}				
	}
	
}
