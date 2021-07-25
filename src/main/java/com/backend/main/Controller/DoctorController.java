package com.backend.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.main.Service.DoctorService;
import com.backend.main.model.DoctorDetails;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	DoctorController(DoctorService doctorService){
		this.doctorService = doctorService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<DoctorDetails>> getAllDoctors()
	{
		List<DoctorDetails> doctors = this.doctorService.getDoctors();
		return new ResponseEntity<>(doctors, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<DoctorDetails> addDoctors(@RequestBody DoctorDetails doctor)
	{
		DoctorDetails doctorAdded = this.doctorService.addDoctor(doctor);
		return new ResponseEntity<>(doctorAdded, HttpStatus.CREATED);
	}
	@GetMapping("/find/id/{id}")
	public ResponseEntity<DoctorDetails> getDoctorById(@PathVariable(value="id") Integer id)
	{
		DoctorDetails doctor = this.doctorService.getDoctorById(id);
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}
	@GetMapping("/find/{email}")
	public ResponseEntity<DoctorDetails> getDoctorByEmail(@PathVariable("email") String email)
	{
		DoctorDetails doctor = this.doctorService.getDoctorByEmail(email);
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}
	@GetMapping("/find/{email}/{password}")
	public ResponseEntity<DoctorDetails> getDoctorByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password)
	{
		DoctorDetails doctor = this.doctorService.getDoctorByEmailAndPassword(email, password);
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable("id") Integer id)
	{
		return this.doctorService.deleteDoctor(id);
	}
	
	
}
