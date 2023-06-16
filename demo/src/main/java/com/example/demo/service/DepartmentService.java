package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class DepartmentService {

    public DepartmentRepository departmentRepository;

    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> getDepartment(){
        return departmentRepository.findAll();
    } 

    public Optional<Department> getDepartmentById(Long id){
        return departmentRepository.findById(id);
    }

    
}
