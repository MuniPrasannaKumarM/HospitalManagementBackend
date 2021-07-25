package com.backend.main.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.main.Exception.UserNotFound;
import com.backend.main.Repo.PatientRepo;
import com.backend.main.model.PatientDetails;



@Service
public class PatientService {
	@Autowired
	private final PatientRepo patientRepo;
	PatientService(PatientRepo patientRepo)
	{
		this.patientRepo = patientRepo;
	}
	@Transactional
	public PatientDetails addPatientDetails(PatientDetails patientdetails) {
		return patientRepo.save(patientdetails);
	}
	@Transactional
	public List<PatientDetails> getAllPatientDetails(){
		return patientRepo.findAll();
	}
	@Transactional
	public PatientDetails findPatientDetailsByEmail(String email)
	{
		return patientRepo.findPatientDetailsByEmail(email).orElse(null);
	}
	@Transactional
	public PatientDetails findPatientDetailsById(Integer id)
	{
		return patientRepo.findPatientDetailsById(id).orElse(null);
	}
	@Transactional
	public PatientDetails findPatientDetailsByEmailAndPassword(String email, String password)
	{
		return patientRepo.findPatientDetailsByEmailAndPassword(email, password).orElse(null);
	}
	@Transactional
	public String deletePatientById(int id)
	{
		patientRepo.deleteById(id);
		return "Deleted";
	}
	
}
