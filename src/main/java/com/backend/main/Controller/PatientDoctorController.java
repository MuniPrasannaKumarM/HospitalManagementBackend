package com.backend.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.main.Service.PatientDoctorService;
import com.backend.main.model.PatientDoctorRelation;

@RestController
@RequestMapping("/relation")
public class PatientDoctorController {

	@Autowired
	private PatientDoctorService patientDoctorService;
	
	public PatientDoctorController(PatientDoctorService patientDoctorService) {
		// TODO Auto-generated constructor stub
		this.patientDoctorService = patientDoctorService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<PatientDoctorRelation>> getAllRelations(){
		List<PatientDoctorRelation> relations = this.patientDoctorService.getAllPatientDoctorRelation();
		return new ResponseEntity<>(relations, HttpStatus.OK);
	} 
	@PostMapping("/add")
	public ResponseEntity<PatientDoctorRelation> addPatientDoctorRelation(@RequestBody PatientDoctorRelation patientDoctorRelation){
		patientDoctorRelation.setStatus("Requested");
		PatientDoctorRelation patientDoctorRelationship = this.patientDoctorService.addPatientDoctorRelation(patientDoctorRelation);
		return new ResponseEntity<>(patientDoctorRelationship, HttpStatus.CREATED);
	}
	@GetMapping("/find/appid/{appid}")
	public ResponseEntity<PatientDoctorRelation> getRelationByAppId(@PathVariable("appid") int appid){
		PatientDoctorRelation relations = this.patientDoctorService.getRelationByAppId(appid);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/patientid/{patientid}")
	public ResponseEntity<List<PatientDoctorRelation>> getRelationByPatientId(@PathVariable("patientid") int patientid){
		List<PatientDoctorRelation> relations = this.patientDoctorService.getPatientDoctorRelationByPatientid(patientid);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/doctorid/{doctorid}")
	public ResponseEntity<List<PatientDoctorRelation>> getRelationByDoctorId(@PathVariable("doctorid") int doctorid){
		List<PatientDoctorRelation> relations = this.patientDoctorService.getPatientDoctorRelationByDoctorid(doctorid);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/patientid/status/{patientid}/{status}")
	public ResponseEntity<List<PatientDoctorRelation>> getPatientDoctorRelationByPatientidAndStatus(@PathVariable("patientid") int patientid, @PathVariable("status") String status ){
		List<PatientDoctorRelation> relations = this.patientDoctorService.getPatientDoctorRelationByPatientidAndStatus(patientid, status);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/doctorid/status/{doctorid}/{status}")
	public ResponseEntity<List<PatientDoctorRelation>> getPatientDoctorRelationByDoctoridAndStatus(@PathVariable("doctorid") int doctorid,  @PathVariable("status") String status ){
		List<PatientDoctorRelation> relations = this.patientDoctorService.getPatientDoctorRelationByDoctoridAndStatus(doctorid, status);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/doctorid/date/{doctorid}/{date}")
	public ResponseEntity<List<PatientDoctorRelation>> getPatientDoctorRelationByDoctoridAndDate(@PathVariable("doctorid") int doctorid,  @PathVariable("date") String date ){
//		date = date.substring(0, 4)+"-"+date.substring(4, 6)+"-"+date.substring(6, 8);
		System.out.println("date "+date);
		List<PatientDoctorRelation> relations = this.patientDoctorService.getPatientDoctorRelationByDoctoridAndDate(doctorid, date);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@GetMapping("/find/doctorid/{doctorid}/patientid/{patientid}/date/{date}")
	public ResponseEntity<PatientDoctorRelation> getDoctorPatientByDate(@PathVariable("doctorid") int doctorid, @PathVariable("patientid") int patientid, @PathVariable("date") String date){
		PatientDoctorRelation relations = this.patientDoctorService.getPatientDoctorRelationByDoctoridAndPatientidAndDate(doctorid, patientid, date);
		return new ResponseEntity<>(relations, HttpStatus.OK);
	}
	@PutMapping("/update/appid/prescription")
	@ResponseBody
	public ResponseEntity<PatientDoctorRelation> getDoctorPatientByDate( @RequestBody PatientDoctorRelation patientDoctorRelation){
		System.out.println("Controller "+patientDoctorRelation.toString());
		patientDoctorRelation.setStatus("Completed");
		PatientDoctorRelation relation = this.patientDoctorService.updatePrescription(patientDoctorRelation);
		return new ResponseEntity<>(relation, HttpStatus.OK);
//		PatientDoctorRelation relation = this.patientDoctorService.updatePrescription(appid, prescription);
//		return new ResponseEntity<>(relation, HttpStatus.OK);
	}
	
	@PutMapping("/update/status/{status}")
	@ResponseBody
	public ResponseEntity<PatientDoctorRelation> updateStatus( @RequestBody PatientDoctorRelation patientDoctorRelation, @PathVariable("status") String status){
		patientDoctorRelation.setStatus(status);
		PatientDoctorRelation relation = this.patientDoctorService.updatePrescription(patientDoctorRelation);
		return new ResponseEntity<>(relation, HttpStatus.OK);
//		PatientDoctorRelation relation = this.patientDoctorService.updatePrescription(appid, prescription);
//		return new ResponseEntity<>(relation, HttpStatus.OK);
	}
}
