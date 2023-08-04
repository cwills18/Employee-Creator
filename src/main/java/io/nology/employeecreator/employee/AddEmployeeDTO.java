package io.nology.employeecreator.employee;

public class AddEmployeeDTO {

	String firstName;
	String lastName;
	String dob;
	String contactNumber;
	String address;
	String employmentStatus;
	boolean fullTime;
	Double hoursPerWeek;
	String startDate;
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
