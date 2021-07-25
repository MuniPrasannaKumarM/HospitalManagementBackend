package com.backend.main.Repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.backend.main.model.PatientDoctorRelation;


public interface PatientDoctorRepo extends JpaRepository<PatientDoctorRelation, Integer> {

	Optional<PatientDoctorRelation> findPatientDoctorRelationByAppid(Integer id);
	Optional<List<PatientDoctorRelation>> findPatientDoctorRelationByDoctorid(Integer id);
	Optional<List<PatientDoctorRelation>> findPatientDoctorRelationByPatientid(Integer id);
	@Query(value="Select * from patient_doctor_relation p where p.patientid = ?1 and p.status = ?2", nativeQuery = true)
	Optional<List<PatientDoctorRelation>> findPatientDoctorRelationByPatientidAndStatus(int patientid,String status);
	@Query(value="Select * from patient_doctor_relation p where p.doctorid = ?1 and p.status = ?2", nativeQuery = true)
	Optional<List<PatientDoctorRelation>> findPatientDoctorRelationByDoctoridAndStatus(int doctorid,String status);
	@Query(value="Select * from patient_doctor_relation p where p.doctorid = ?1 and p.date = ?2", nativeQuery = true)
	Optional<List<PatientDoctorRelation>> findPatientDoctorRelationByDoctoridAndDate(int doctorid, String date);
	@Query(value="Select * from patient_doctor_relation p where p.doctorid = ?1 and p.patientid=?2 and p.date = ?3", nativeQuery = true)
	Optional<PatientDoctorRelation> findPatientDoctorRelationByDoctoridAndPatientidAndDate(int doctorid,int patientid, String date );
	
}
