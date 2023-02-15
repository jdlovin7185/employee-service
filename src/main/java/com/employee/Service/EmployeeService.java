package com.employee.Service;

import com.employee.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee loginAccount(String userName, String passWord);
    List<Employee> getEmployees();
    Employee empByID(Long id);
}
