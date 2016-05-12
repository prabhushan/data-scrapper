package com.ozthra.patient.model;

import java.util.Date;

public class Report {
private String patientId;
private String name;
private String description;
private String tags;
private String filePath;
private Date dateOfReport;

public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTags() {
	return tags;
}
public void setTags(String tags) {
	this.tags = tags;
}
public String getFilePath() {
	return filePath;
}
public void setFilePath(String filePath) {
	this.filePath = filePath;
}
public Date getDateOfReport() {
	return dateOfReport;
}
public void setDateOfReport(Date dateOfReport) {
	this.dateOfReport = dateOfReport;
}
}
