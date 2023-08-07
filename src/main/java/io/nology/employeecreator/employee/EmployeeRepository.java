package io.nology.employeecreator.employee;

import org.springframework.data.jpa.repository.JpaRepository;

//see JpaRepository in Java docs for methods possible with the repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}
