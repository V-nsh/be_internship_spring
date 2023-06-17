package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    public final EmployeeRepository employeeRepository;

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee Employee) {
        return employeeRepository.save(Employee);
    }

    // public void deleteStudent(Long id) {
    //     employeeRepository.deleteById(id);
    // }

    // public Optional<Employee> updateEmployee(Employee employee, Long id) {
    //     Optional<Employee> existingEmployee = this.getEmployeeById(id);
    //     if (existingEmployee.isPresent()) {
    //         existingEmployee.get().setname(employee.getname());
    //         existingEmployee.get().setemail(employee.getemail());
    //         existingEmployee.get().setid(employee.getid());

    //         employeeRepository.save(existingEmployee.get());
    //         return existingEmployee;
    //     }
    //     return existingEmployee;
    // }

}
