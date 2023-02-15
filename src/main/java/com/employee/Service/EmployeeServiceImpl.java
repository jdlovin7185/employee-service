package com.employee.Service;

import com.employee.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee loginAccount(String userName, String passWord) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Employee empByID(Long id) {
        return null;
    }
}
