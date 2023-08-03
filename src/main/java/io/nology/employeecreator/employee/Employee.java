package io.nology.employeecreator.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

//this class represents what the data in the database should look like

@Entity
@Table(name="employees")
public class Employee {
	
	//this tag is used to identify the ID
	@Id
	//this tag is used to generate the id key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	String firstName;
	@Column
	String lastName;
	@Column
	String dob;
	//use format DD/MM/YYYY
	@Column
	String contactNumber;
	@Column
	String address;
	@Column
	String employmentStatus;
	//eg: Permanent, Contract, Temp, Casual
	@Column
	boolean fullTime;
	@Column
	Double hoursPerWeek;
	@Column
	String startDate;
	@Column
	String finishDate;
	@Column
	Double lengthOfService;
	@Column
	Integer annualSalary;
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public boolean isFullTime() {
		return fullTime;
	}
	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}
	public Double getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(Double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public Double getLengthOfService() {
		return lengthOfService;
	}
	public void setLengthOfService(Double lengthOfService) {
		this.lengthOfService = lengthOfService;
	}
	public Integer getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(Integer annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	//Constructor
	public Employee(String firstName, String lastName, String dob, String contactNumber, String address,
			String employmentStatus, boolean fullTime, Double hoursPerWeek, String startDate, String finishDate,
			Double lengthOfService, Integer annualSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.address = address;
		this.employmentStatus = employmentStatus;
		this.fullTime = fullTime;
		this.hoursPerWeek = hoursPerWeek;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.lengthOfService = lengthOfService;
		this.annualSalary = annualSalary;
	}
	
	
}
