package com.pcsgpl.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="employee_personal_details")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity

public class EmployeePersonalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "employee_id")
	private int employee_id ;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "location_id")
	private int  location_id ;
	
	@Column(name = "pin")
	private int   pin;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "alternate_phone")
	private String alternate_phone;
	
	@Column(name = "gender")
	private char  gender;
	
	@Column(name = "country_id")
	private int  country_id;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "date_of_birth")
	private Date date_of_birth;
	
	@Column(name = "marital_status")
	private char marital_status;
	
	
	public EmployeePersonalDetails(int userId,int employee_id, String address, int location_id, int pin, String  phone, String  alternate_phone,
			char gender, int country_id, String email_id, Date date_of_birth, char marital_status) {
		super();
		
		this.userId = userId;
		this.employee_id = employee_id;
		this.address = address;
		this.location_id = location_id;
		this.pin = pin;
		this.phone = phone;
		this.alternate_phone = alternate_phone;
		this.gender = gender;
		this.country_id = country_id;
		this.email_id = email_id;
		this.date_of_birth = date_of_birth;
		this.marital_status = marital_status;
	}
	public EmployeePersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAlternate_phone() {
		return alternate_phone;
	}
	public void setAlternate_phone(String alternate_phone) {
		this.alternate_phone = alternate_phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public char getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(char marital_status) {
		this.marital_status = marital_status;
	}
	
}
