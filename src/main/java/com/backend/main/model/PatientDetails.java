package com.backend.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientDetails implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, updatable=false)
	private int id;
	private String name;
	@Column(nullable=false)
	private String username;
	private String phone;
	@Column(nullable=false)
	private String email;
	private String age;
	@Column(nullable=false)
	private String password;
	private String address;
	private String height;
	private String weight;
	private String imageurl;
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDetails(String name, String username, String phone, String email, String age, String password,
			String address, String height, String weight) {
		super();
		this.name = name;
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.password = password;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", name=" + name + ", username=" + username + ", phone=" + phone
				+ ", email=" + email + ", age=" + age + ", password=" + password + ", address=" + address + ", height="
				+ height + ", weight=" + weight + ", imageurl=" + imageurl + "]";
	}
	
	
}
