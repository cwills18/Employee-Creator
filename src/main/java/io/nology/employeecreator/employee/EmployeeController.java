package io.nology.employeecreator.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	//Dependency Injection
	@Autowired
	private EmployeeService service;

	// post
	@PostMapping
	public String addEmployee(@RequestBody AddEmployeeDTO data) {
		//forward the request body to the service layer
		//aka call the method from the service layer that does all the tasks
		this.service.add(data);
		return "Employee added";
	}
	
}
