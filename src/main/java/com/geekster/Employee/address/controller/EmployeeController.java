package com.geekster.Employee.address.controller;

import com.geekster.Employee.address.models.Employee;
import com.geekster.Employee.address.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.findEmployeeById(id);
    }

    @PostMapping
    public void createEmployee(@RequestBody Employee employee){
         employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployees(@PathVariable Long id, @RequestBody Employee employee){
        employeeService. updateEmployees(id,employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }

}
