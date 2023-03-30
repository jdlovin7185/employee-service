package com.employee.Service;

import com.employee.Entity.Employee;
import com.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee empByID(Long id) {
        Optional<Employee> optionalEmployee = repository.findById(id);
        Employee employee = null;
        if (optionalEmployee.isPresent())
            employee = optionalEmployee.get();
        else
            throw new RuntimeException(
                    "Employee not found for id : " + id
            );
        return employee;
    }
}
