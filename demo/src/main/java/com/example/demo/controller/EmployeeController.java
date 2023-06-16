package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")




public class EmployeeController {
    private  EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> getEmployee() {
        return ResponseEntity.ok(employeeService.getEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody Employee Employee) {
        return ResponseEntity.ok(employeeService.addEmployee(Employee));
    }

    

   
    
}



