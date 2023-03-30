package com.employee.Service;

import com.employee.Entity.Employee;

import java.util.List;


public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee loginAccount(String userName, String passWord);
    List<Employee> getEmployees();

    Employee empByID(Long id);
}
