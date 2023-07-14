/**
 * 
 */
package com.einfochips.evaluation_project_practice.employee_mgmt_service.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author 158417
 *
 */
@Entity
public class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "name")
    private String col1name;
    @Column(name = "email")
    private String col2email;
    @Column(name = "jobTitle")
    private String col3jobTitle;
    @Column(name = "phone")
    private String col4phone;
    @Column(name = "imageUrl")
    private String col5imageUrl;
    @Column(name = "employeeCode", nullable = false, updatable = false)
    private String col6employeeCode;

    public Employee() {}

    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.col1name = name;
        this.col2email = email;
        this.col3jobTitle = jobTitle;
        this.col4phone = phone;
        this.col5imageUrl = imageUrl;
        this.col6employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return col1name;
    }

    public void setName(String name) {
        this.col1name = name;
    }

    public String getEmail() {
        return col2email;
    }

    public void setEmail(String email) {
        this.col2email = email;
    }

    public String getJobTitle() {
        return col3jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.col3jobTitle = jobTitle;
    }

    public String getPhone() {
        return col4phone;
    }

    public void setPhone(String phone) {
        this.col4phone = phone;
    }

    public String getImageUrl() {
        return col5imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.col5imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return col6employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.col6employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + col1name + '\'' +
                ", email='" + col2email + '\'' +
                ", jobTitle='" + col3jobTitle + '\'' +
                ", phone='" + col4phone + '\'' +
                ", imageUrl='" + col5imageUrl + '\'' +
                '}';
    }
}
