package io.nology.employeecreator.employee;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class AddEmployeeDTO {

	@Pattern(regexp = "^[a-zA-Z-]{2,}$",
            message = "names should contain at least two characters with no special characters other than hyphens")
	String firstName;
	
	@Pattern(regexp = "^[a-zA-Z-]{2,}$",
            message = "names should contain at least two characters with no special characters other than hyphens")
	String lastName;
	
	@Pattern(regexp = "^[12]{1}[0-9]{3}[-/]{1}(1[012]|0[1-9])[-/]{1}(3[01]|[12][0-9]|0[1-9])$",
            message = "Date of births must be entered in the format YYYY/MM/DD and must be in the last 1000 years.")
	String dob;
	
	@Pattern(regexp = "^[+]{0,1}[0-9]{0,3}[0-9]{8,12}$",
            message = "phone numbers should contain only digits without dashes. Country codes with a + symbol are optional.")
	String contactNumber;
	
	@Pattern(regexp = "^[a-zA-Z0-9,-/\s]{15,}$",
            message = "addresses should contain only alphanumeric characters, digits and the characters , / and -. They should be a minimum of 15 characters.")
	String address;
	
	@NotBlank
	String employmentStatus;
	
	@NotNull
	boolean fullTime;
	
	@NotNull
	Double hoursPerWeek;
	
	@NotBlank
	String startDate;
	
	@NotNull
	Integer annualSalary;
	
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
	public Integer getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(Integer annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public AddEmployeeDTO(String firstName, String lastName, String dob, String contactNumber, String address,
			String employmentStatus, boolean fullTime, Double hoursPerWeek, String startDate, Integer annualSalary) {
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
		this.annualSalary = annualSalary;
	}
	
	
	
}
