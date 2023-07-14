/**
 * 
 */
package com.einfochips.evaluation_project_practice.employee_mgmt_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfochips.evaluation_project_practice.employee_mgmt_service.exceptions.UserNotFoundException;
import com.einfochips.evaluation_project_practice.employee_mgmt_service.model.Employee;
import com.einfochips.evaluation_project_practice.employee_mgmt_service.repository.EmployeeRepository;

/**
 * @author 158417
 *
 */
@Service
public class EmployeeService {
	private final EmployeeRepository employeerepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeerepository = employeeRepository;
	}

	public Employee addEmployee(Employee employee) {
//		System.out.println("this one" + employee);
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeerepository.save(employee);
	}
//	cannot do above because records in java are immutable.
// not using record due to further complexities

//	public Employee addEmployee(Employee employee) {
////		System.out.println(employee);
//		Employee updatedEmployee = new Employee(employee.id(), employee.name(), employee.email(), employee.jobTitle(),
//				employee.phone(), employee.imageURL(), UUID.randomUUID().toString());
//
//		return employeerepository.save(updatedEmployee);
//	}

	public List<Employee> findAllEmployees() {
		return employeerepository.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	public void deleteEmplyee(Long id) {
		employeerepository.deleteEmployeeById(id);
	}

	public Employee findEmployeeById(Long id) {
		return employeerepository.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("Employee with ID" + id + "was not found"));
	}

}
