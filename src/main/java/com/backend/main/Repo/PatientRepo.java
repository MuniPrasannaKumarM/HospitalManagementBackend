package com.backend.main.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.main.model.PatientDetails;



public interface PatientRepo extends JpaRepository<PatientDetails, Integer> {

	@Query(value="Select * from patient_details p where p.email = ?1 and p.password = ?2", nativeQuery = true)
	Optional<PatientDetails> findPatientDetailsByEmailAndPassword(String email,String password);
	Optional<PatientDetails> findPatientDetailsByEmail(String email);
	Optional<PatientDetails> findPatientDetailsById(Integer id);
}
