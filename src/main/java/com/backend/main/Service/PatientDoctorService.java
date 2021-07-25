package com.backend.main.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.main.Repo.PatientDoctorRepo;
import com.backend.main.model.PatientDoctorRelation;

@Service
public class PatientDoctorService {
	@Autowired
	private PatientDoctorRepo patientDoctorepo;
	public PatientDoctorService(PatientDoctorRepo patientDoctorRepo) {
		// TODO Auto-generated constructor stub
		this.patientDoctorepo = patientDoctorRepo;
	}
	@Transactional
	public List<PatientDoctorRelation> getAllPatientDoctorRelation(){
		return this.patientDoctorepo.findAll();
	}
	@Transactional
	public PatientDoctorRelation addPatientDoctorRelation(PatientDoctorRelation patientDoctorRelation) {
		return this.patientDoctorepo.save(patientDoctorRelation);
	}
	@Transactional
	public PatientDoctorRelation getRelationByAppId(int appid)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByAppid(appid).orElse(null);
	}
	@Transactional
	public List<PatientDoctorRelation> getPatientDoctorRelationByDoctorid(int doctorid)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByDoctorid(doctorid).orElse(null);
	}
	@Transactional
	public List<PatientDoctorRelation> getPatientDoctorRelationByPatientid(int patientid)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByPatientid(patientid).orElse(null);
	}
	@Transactional
	public List<PatientDoctorRelation> getPatientDoctorRelationByPatientidAndStatus(int patientid,String status)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByPatientidAndStatus(patientid, status).orElse(null);
	}
	@Transactional
	public List<PatientDoctorRelation> getPatientDoctorRelationByDoctoridAndStatus(int doctorid,String status)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByDoctoridAndStatus(doctorid, status).orElse(null);
	}
	@Transactional
	public List<PatientDoctorRelation> getPatientDoctorRelationByDoctoridAndDate(int doctorid,String date)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByDoctoridAndDate(doctorid, date).orElse(null);
	}
	public PatientDoctorRelation getPatientDoctorRelationByDoctoridAndPatientidAndDate(int doctorid, int patientid, String date)
	{
		return this.patientDoctorepo.findPatientDoctorRelationByDoctoridAndPatientidAndDate(doctorid, patientid, date).orElse(null);
	}
	@Transactional
	public PatientDoctorRelation updatePrescription(PatientDoctorRelation patientDoctorRelation) {
//		PatientDoctorRelation patientToUpdate = this.patientDoctorepo.findById(appid).orElse(null);
//		if(patientToUpdate != null) {
//			patientToUpdate.setPrescription(prescription);
//			this.patientDoctorepo.save(patientToUpdate);
//			PatientDoctorRelation result = this.patientDoctorepo.findById(appid).orElse(null);
//			return result;
//		}
		
		this.patientDoctorepo.save(patientDoctorRelation);
		return null;
//		return this.patientDoctorepo.updatePrescription(appid, prescription).orElse(null);
	}
	
	
}
