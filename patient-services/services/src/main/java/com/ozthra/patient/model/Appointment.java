package com.ozthra.patient.model;

//import com.ozthra.common.models.Reminders;
//import com.ozthra.common.models.Timing;

public class Appointment {

	private String appointmentId;
	private String patientId;
	private String providerId;
	private String clinicId;
//	private Timing timing;
	private String symptoms;
	private String comments;
//	private Reminders reminder;
	
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getClinicId() {
		return clinicId;
	}
	public void setClinicId(String clinicId) {
		this.clinicId = clinicId;
	}
	/*public Timing getTiming() {
		return timing;
	}
	public void setTiming(Timing timing) {
		this.timing = timing;
	}*/
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	/*public Reminders getReminder() {
		return reminder;
	}
	public void setReminder(Reminders reminder) {
		this.reminder = reminder;
	}*/

}
