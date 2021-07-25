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

import com.backend.main.Service.PatientService;
import com.backend.main.model.PatientDetails;



@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private final PatientService patientService;
	
	PatientController(PatientService patientService)
	{
		this.patientService = patientService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<PatientDetails>> getAllEmployees(){
		List<PatientDetails> patients = patientService.getAllPatientDetails();
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	@GetMapping("/find/{email}")
	public ResponseEntity<PatientDetails> getEmployeeByemail(@PathVariable("email") String email){
		PatientDetails patient = this.patientService.findPatientDetailsByEmail(email);
		return new ResponseEntity<>(patient, HttpStatus.OK);
		
	}
	@GetMapping("/find/patientid/{id}")
	public ResponseEntity<PatientDetails> getEmployeeById(@PathVariable("id") int patientid){
		System.out.println("coming here ");
		PatientDetails patient = this.patientService.findPatientDetailsById(patientid);
		return new ResponseEntity<>(patient, HttpStatus.OK);
		
	}
	@GetMapping("/find/{email}/{password}")
	public ResponseEntity<PatientDetails> getEmployeeByemailandpassword(@PathVariable("email") String email, @PathVariable("password") String password){
		
		PatientDetails patient = this.patientService.findPatientDetailsByEmailAndPassword(email, password);
		return new ResponseEntity<>(patient, HttpStatus.OK);
		
	}
	@PostMapping("/add")
	public ResponseEntity<PatientDetails> addEmployee(@RequestBody PatientDetails patient){
		PatientDetails newPatient = patientService.addPatientDetails(patient);
		return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable("id") int id)
	{
		patientService.deletePatientById(id);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}

}
