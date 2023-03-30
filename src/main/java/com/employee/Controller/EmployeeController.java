package com.employee.Controller;

import com.employee.Entity.Employee;
import com.employee.Service.EmployeeService;
import com.employee.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", service.getEmployees());
        return "index";
    }

    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee){

        return service.addEmployee(employee);
    }

    @PutMapping("/")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/")
    public void deleteEmployee(@RequestBody Employee employee){
        service.deleteEmployee(employee);
    }

//    @GetMapping("/")
    public String randomMessage(){
        return "Hi lil duck";
    }

}


