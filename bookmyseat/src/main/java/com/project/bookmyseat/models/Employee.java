package com.project.bookmyseat.models;


import java.util.*;

import javax.persistence.*;



@Entity

public class Employee {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
    private String email;

    private String password;
   
    private String phoneNumber;
    
	private int managerId;
    
    @OneToOne(mappedBy="employee")
     private Bookmyoffice bookmyoffice;
    
    public Employee() {
    	
    }
    
    

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
    
    
    

}
