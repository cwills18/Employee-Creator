package io.nology.employeecreator.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	
	public Employee add(AddEmployeeDTO data) {
		//turn DTO into an Employee
		String firstName = data.getFirstName().trim();
		String lastName = data.getLastName().trim();
		String dob = data.getDob().trim();
		String contactNumber = data.getContactNumber().trim();
		String address = data.getAddress().trim();
		String employmentStatus = data.getEmploymentStatus().trim();
		boolean fullTime = data.isFullTime();
		Double hoursPerWeek = data.getHoursPerWeek();
		String startDate = data.getStartDate().trim();
		Integer annualSalary = data.getAnnualSalary();

		String today = java.time.LocalDate.now().toString();
		Double lengthOfService = calculateYearDiff(startDate, today);
		
		Employee employee = new Employee();
		
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setDob(dob);
		employee.setContactNumber(contactNumber);
		employee.setAddress(address);
		employee.setEmploymentStatus(employmentStatus);
		employee.setFullTime(fullTime);
		employee.setHoursPerWeek(hoursPerWeek);
		employee.setStartDate(startDate);
		employee.setFinishDate(null);
		employee.setLengthOfService(lengthOfService);
		employee.setAnnualSalary(annualSalary);
		
		//call the repository layer to save that prepared Employee in the database
		//return it
		return this.repository.save(employee);
		
	}
	
	public static Double calculateYearDiff(String startDate, String currentDate){
        Double years = 0.0;
        Double yearDiff;
        Integer startYear = Integer.valueOf(startDate.substring(0,4));
        Integer currentYear = Integer.valueOf(currentDate.substring(0,4));
        Integer startMonth = Integer.valueOf(startDate.substring(5,7));
        Integer startDay = Integer.valueOf(startDate.substring(8,10));
        
        int todayDayOfYear = java.time.LocalDate.now().getDayOfYear();
        Double todayDayNum = Double.valueOf(todayDayOfYear);
       
        int startingDayOfYear = java.time.LocalDate.of(startYear, startMonth, startDay).getDayOfYear();
        Double startingDayNum = Double.valueOf(startingDayOfYear);
     
        
        if (startYear.equals(currentYear)){
        	if (currentYear % 4 == 0) {
        		years = Double.valueOf(todayDayOfYear - startingDayOfYear)/366;
        	} else {
        		years = Double.valueOf(todayDayOfYear - startingDayOfYear)/365;
        	}
        } else {
        	//removing one from the year as the days on either side of whole years will be added as ratios of a year in later steps
            yearDiff = Double.valueOf(currentYear - startYear - 1);
            years += yearDiff;
            //add days from the current partial year
            if (currentYear % 4 == 0 ){
                years += (todayDayNum / 366);
            } else {
                years += (todayDayNum / 365);
            }
            //add days from the starting partial year
            if (startYear % 4 == 0){
                years += ((366 - startingDayNum)/366);
            } else {
                years += ((365 - startingDayNum)/365);
            }
        }
        Double yearsFormatted = Math.round(years * 100.0) / 100.0;
        return yearsFormatted;
}
}



 
 

