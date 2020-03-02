package com.openclassrooms.SafetyNet;

import java.util.Set;

public class MedicalrecordsModel {
	
	private String firstName;
	private String lastName;
	private String birthDate;
	private Set<String> medications;
	private Set<String> allergies;
	
	public MedicalrecordsModel() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthdate() {
		return birthDate;
	}
	public void setBirthdate(String birthdate) {
		this.birthDate = birthdate;
	}
	public Set<String> getMedications() {
		return medications;
	}
	public void setMedications(Set<String> medications) {
		this.medications = medications;
	}
	public Set<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(Set<String> allergies) {
		this.allergies = allergies;
	}

}
