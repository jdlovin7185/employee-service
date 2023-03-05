package com.employee.Service;

import com.employee.Entity.Employee;
import com.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee addEmployee(Employee employee) {

        return repository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        return repository.save(employee);

    }

    @Override
    public void deleteEmployee(Employee employee) {
        repository.delete(employee);
    }

    @Override
    public Employee loginAccount(String userName, String passWord) {
        return null;
    }

    @Override
    public List<Employee> getEmployees(String userName) {
        return null;
    }

    @Override
    public Employee empByID(Long id) {
        return null;
    }
}
