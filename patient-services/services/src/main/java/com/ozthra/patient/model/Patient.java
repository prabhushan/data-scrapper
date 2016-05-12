package com.ozthra.patient.model;

import java.util.Date;
import java.util.List;

//import com.ozthra.common.models.Location;

public class Patient {
	
	private String patientId;
	private String firstName;
	private String lastName;
	private Date dateofBirth;
	private String mobileNumber;
	private String email;
	/*private Location location;*/
	private List relationShipId;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
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
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}*/
	public List getRelationShipId() {
		return relationShipId;
	}
	public void setRelationShipId(List relationShipId) {
		this.relationShipId = relationShipId;
	}

}
