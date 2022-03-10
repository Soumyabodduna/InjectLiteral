package com.dxc;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
    private String empName;
    private int empId;
    private String empAddress;
    @Value("${Employee.Name}")//value annotation is used insted of property tag in xml
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Value("${Employee.ID}")
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    @Value("${Employee.Address}")
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public void showDetails() {
        System.out.println("Employee Name: " +empName);
        System.out.println("Employee ID: "+ empId);
        System.out.println("Employee Address: "+empAddress);
    }
}
