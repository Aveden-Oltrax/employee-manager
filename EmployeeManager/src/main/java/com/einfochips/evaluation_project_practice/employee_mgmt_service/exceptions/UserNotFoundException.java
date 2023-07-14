/**
 * 
 */
package com.einfochips.evaluation_project_practice.employee_mgmt_service.exceptions;

/**
 * @author 158417
 *
 */
public class UserNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super (message);
	}

}
