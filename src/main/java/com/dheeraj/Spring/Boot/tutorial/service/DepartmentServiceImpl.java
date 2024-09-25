package com.dheeraj.Spring.Boot.tutorial.service;

import com.dheeraj.Spring.Boot.tutorial.entity.Department;
import com.dheeraj.Spring.Boot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
