package com.ozthra.patient.services;

import java.util.List;

import com.ozthra.patient.model.Appointment;
import com.ozthra.patient.model.Patient;
import com.ozthra.patient.model.Report;
import com.ozthra.patient.model.Reviews;

public interface PatientServices{
	
	boolean createPatient(Patient patient);
	boolean updatePatient(Patient patient);
	Patient getPatient(Patient patient);
	boolean addDependants(Patient patient);
	
	boolean createAppointment(Appointment appointment);
	boolean cancelAppointment(Appointment appointment);
	boolean modifyAppointment(Appointment appointment);
	
	boolean uploadMedicalReports(Report report);
	List<Report> fetchMedicalReports(Report report);
	
	boolean createPatientReviews(Reviews review);
}