package io.nology.employeecreator.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//get
	@GetMapping
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> allEmployees = this.service.getAll();
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Optional<Employee> employeeMatch = this.service.getEmployeeById(id);
		if(employeeMatch.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Employee>(employeeMatch.get(), HttpStatus.OK);
		}
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Long id){
		boolean employeeDeleted = this.service.deleteEmployeeById(id);
		if(employeeDeleted) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
}
