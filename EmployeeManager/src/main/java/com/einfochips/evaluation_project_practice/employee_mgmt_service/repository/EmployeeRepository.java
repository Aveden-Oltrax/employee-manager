/**
 * 
 */
package com.einfochips.evaluation_project_practice.employee_mgmt_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.evaluation_project_practice.employee_mgmt_service.model.Employee;

/**
 * @author 158417
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);
	
	
//  using optional here because in some case there might be no employee with the particular ID
	Optional<Employee> findEmployeeById(Long id);

}
