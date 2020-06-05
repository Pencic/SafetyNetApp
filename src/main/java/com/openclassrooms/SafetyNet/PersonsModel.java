package com.openclassrooms.SafetyNet;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonsModel {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zip;
	private String phone;
	private String email;
	
	public PersonsModel() {
		
	}
	
	public MedicalrecordsModel getMedicalrecords() {
		
		List<MedicalrecordsModel> allMedicalRecords = CompositeModel.getMedicalrecords(); 
		
		for(MedicalrecordsModel medicalrecord:allMedicalRecords) {			
			if(medicalrecord.getFirstName().equals(this.firstName) && medicalrecord.getLastName().equals(this.lastName))
				return medicalrecord;
		}
		return null;
		
	}
	
	
	public static List<PersonsModel> getPersonsForAddress(List<PersonsModel> persons , String address){
		
		List<PersonsModel> result = new ArrayList<PersonsModel>();
		
		for(PersonsModel person : persons) {
			if(person.getAddress() == address)
				result.add(person);
		}
		
		return result;
	}
	
	public static List<PersonsModel> filterChildren(List<PersonsModel> persons){
		
		List<PersonsModel> result = new ArrayList<PersonsModel>();
		
		for(PersonsModel person : persons) {
			if(person.getAge() < 18)
				result.add(person);
		}
		
		return result;
	}
	
	
	
	public String getBirthDate() {
		
		return this.getMedicalrecords().getBirthdate();
		
	}
	
	public int getAge() {
		
		LocalDate localDate = LocalDate.parse(getBirthDate());
		LocalDate now = LocalDate.now();
		return  Period.between(now, localDate).getYears();
		
	}
	
	public Set<String> getMedications() {
		
		return this.getMedicalrecords().getMedications();
		
	}
	
	public Set<String> getAllergies() {
		
		return this.getMedicalrecords().getAllergies();
		
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}


