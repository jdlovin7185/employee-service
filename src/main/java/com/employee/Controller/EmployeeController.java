package com.employee.Controller;

import com.employee.Entity.Employee;
import com.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){

        return service.addEmployee(employee);
    }

    @PostMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee, Long id){
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestBody Employee employee){
        service.deleteEmployee(employee);
    }

    @GetMapping("/")
    public String randomMessage(){
        return "Hi lil bitch";
    }
}


