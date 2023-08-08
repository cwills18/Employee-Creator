package io.nology.employeecreator.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	//Dependency Injection
	@Autowired
	private EmployeeService service;

	// post
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody AddEmployeeDTO data) {
		//forward the request body to the service layer
		//aka call the method from the service layer that does all the tasks
		Employee newEmployee = this.service.add(data);
		//first parameter in this is the body and the second parameter is the status code
		return new ResponseEntity<Employee>(newEmployee, HttpStatus.CREATED);
	}
	
}
