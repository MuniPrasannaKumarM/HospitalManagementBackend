package com.backend.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PatientDoctorRelation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, updatable=false)
	private int appid;
	@Column(nullable=false, updatable=false)
	private int doctorid;
	@Column(nullable=false, updatable=false)
	private int patientid;
	private String date;
	private String time;
	private String status;
	@Column(columnDefinition= "VARCHAR(8000)")
	private String prescription;
	public PatientDoctorRelation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDoctorRelation(int doctorid, int patientid, String date, String time, String status,
			String prescription) {
		super();
		this.doctorid = doctorid;
		this.patientid = patientid;
		this.date = date;
		this.time = time;
		this.status = status;
		this.prescription = prescription;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	@Override
	public String toString() {
		return "PatientDoctorRelation [appid=" + appid + ", doctorid=" + doctorid + ", patientid=" + patientid
				+ ", date=" + date + ", time=" + time + ", status=" + status + ", prescription=" + prescription + "]";
	}
	
}
