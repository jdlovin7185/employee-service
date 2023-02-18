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
    public Employee updateEmployee(long id, Employee employee) {
        Employee employee1 = repository.getReferenceById(id);
        employee1.setFirstName(employee1.getFirstName());
        employee1.setLastName(employee1.getLastName());
        employee1.setUserName(employee1.getUserName());
        employee1.setPassWord(employee1.getPassWord());
        return repository.save(employee1);

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
        return null;
    }

    @Override
    public Employee empByID(Long id) {
        return null;
    }
}
