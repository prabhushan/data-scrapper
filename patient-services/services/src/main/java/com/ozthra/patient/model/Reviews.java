package com.ozthra.patient.model;

import java.util.Date;

public class Reviews {
	
	private String patientId;
	private String provderId;
	private String clinicId;
	private String reviewComments;
	private int fivePointRating;
	private Date reviewDate;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getProvderId() {
		return provderId;
	}
	public void setProvderId(String provderId) {
		this.provderId = provderId;
	}
	public String getClinicId() {
		return clinicId;
	}
	public void setClinicId(String clinicId) {
		this.clinicId = clinicId;
	}
	public String getReviewComments() {
		return reviewComments;
	}
	public void setReviewComments(String reviewComments) {
		this.reviewComments = reviewComments;
	}
	public int getFivePointRating() {
		return fivePointRating;
	}
	public void setFivePointRating(int fivePointRating) {
		this.fivePointRating = fivePointRating;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
