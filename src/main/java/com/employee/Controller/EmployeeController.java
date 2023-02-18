package com.employee.Controller;

import com.employee.Entity.Employee;
import com.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("employee/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PostMapping("employee/update")
    public Employee updateEmployee(@RequestBody Employee employee, Long id){
        return service.updateEmployee(id, employee);
    }
}
