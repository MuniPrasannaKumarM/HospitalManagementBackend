package com.backend.main.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.main.Repo.DoctorRepo;
import com.backend.main.model.DoctorDetails;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;
	DoctorService(DoctorRepo doctorRepo){
		this.doctorRepo = doctorRepo;
	}
	@Transactional
	public DoctorDetails addDoctor(DoctorDetails doctor ) {
		return doctorRepo.save(doctor);
	}
	public List<DoctorDetails> getDoctors(){
		return doctorRepo.findAll();
	}
	@Transactional
	public DoctorDetails getDoctorByEmail(String email)
	{
		return doctorRepo.findDoctorDetailsByEmail(email).orElse(null);
	}
	@Transactional
	public DoctorDetails getDoctorByEmailAndPassword(String email, String password) {
		return doctorRepo.findDoctorDetailsByEmailAndPassword(email,password).orElse(null);
	}
	@Transactional
	public DoctorDetails getDoctorById(Integer id)
	{
		return doctorRepo.findDoctorDetailsByDoctor_id(id).orElse(null);
	}
	@Transactional
	public String deleteDoctor(Integer id)
	{
		doctorRepo.deleteById(id);
		return "Deleted";
	}
}
