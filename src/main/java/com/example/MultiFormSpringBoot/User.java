package com.example.MultiFormSpringBoot;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_info")
public class User {
	@Id
	 @Column(name = "contactNo")
	private String contactNo;
	@Column(name = "name")
	private String name;
	 @Column(name = "email")
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	 @Column(name = "dob")
	private LocalDate dob;
	
	 @Column(name = "gender")
	private String gender;
	 @Column(name = "tenth")
	private Integer tenth;
	 @Column(name = "twelveth")
	private Integer twelveth;
	 @Column(name = "ug")
	private Integer ug;
	 @Column(name = "pg")
	private Integer pg;
	 @Column(name = "certification")
	private String certifications;
	 @Column(name = "internship")
	private String internships;
	 @Column(name = "hobbies")
	private String hobbies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	} 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Integer getTenth() {
		return tenth;
	}
	public void setTenth(Integer tenth) {
		this.tenth = tenth;
	}
	public Integer getTwelveth() {
		return twelveth;
	}
	public void setTwelveth(Integer twelveth) {
		this.twelveth = twelveth;
	}
	public Integer getUg() {
		return ug;
	}
	public void setUg(Integer ug) {
		this.ug = ug;
	}
	public Integer getPg() {
		return pg;
	}
	public void setPg(Integer pg) {
		this.pg = pg;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public String getInternships() {
		return internships;
	}
	public void setInternships(String internships) {
		this.internships = internships;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public User(String name, String email, LocalDate dob,String contactNo, String gender, int tenth, int twelveth, int ug, int pg,
			String certifications, String internships, String hobbies) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.tenth = tenth;
		this.twelveth = twelveth;
		this.ug = ug;
		this.pg = pg;
		this.certifications = certifications;
		this.internships = internships;
		this.hobbies = hobbies;
	}
	public User(String name, String email, LocalDate dob,String contactNo, String gender, int tenth, int twelveth, int ug, int pg) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.tenth = tenth;
		this.twelveth = twelveth;
		this.ug = ug;
		this.pg = pg;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", dob=" + dob + ", contactNo=" + contactNo + ", gender="
				+ gender + ", tenth=" + tenth + ", twelveth=" + twelveth + ", ug=" + ug + ", pg=" + pg
				+ ", certifications=" + certifications + ", internships=" + internships + ", hobbies=" + hobbies + "]";
	}
	
	
	
}
