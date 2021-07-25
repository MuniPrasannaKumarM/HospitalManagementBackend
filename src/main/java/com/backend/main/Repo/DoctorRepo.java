package com.backend.main.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.main.model.DoctorDetails;


public interface DoctorRepo extends JpaRepository<DoctorDetails, Integer>{
	
	@Query(value="Select * from doctor_details p where p.email = ?1 and p.password = ?2", nativeQuery = true)
	Optional<DoctorDetails> findDoctorDetailsByEmailAndPassword(String email,String password);
	Optional<DoctorDetails> findDoctorDetailsByEmail(String email);
	@Query(value="select * from doctor_details p where p.doctor_id = ?1", nativeQuery = true)
	Optional<DoctorDetails> findDoctorDetailsByDoctor_id(Integer id);
}
