package com.backend.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DoctorDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, updatable=false)
	private int doctor_id; 
	private String firstname; 
	private String lastname; 
	private String username; 
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	private String specialism; 
	private String gender; 
	private String address; 
	private String country; 
	private String city; 
	private String state; 
	private String pincode; 
	private String phone; 
	private String profile_pic; 
	private String bio;
	public DoctorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorDetails(String firstname, String lastname, String username, String email, String password,
			String specialism, String gender, String address, String country, String city, String state, String pincode,
			String phone, String profile_pic, String bio) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.specialism = specialism;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phone = phone;
		this.profile_pic = profile_pic;
		this.bio = bio;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialism() {
		return specialism;
	}
	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfile_pic() {
		return profile_pic;
	}
	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "DoctorDetails [doctor_id=" + doctor_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", email=" + email + ", password=" + password + ", specialism="
				+ specialism + ", gender=" + gender + ", address=" + address + ", country=" + country + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", phone=" + phone + ", profile_pic=" + profile_pic
				+ ", bio=" + bio + "]";
	}
	
}
