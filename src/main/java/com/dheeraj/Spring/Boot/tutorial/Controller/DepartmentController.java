package com.dheeraj.Spring.Boot.tutorial.Controller;

import com.dheeraj.Spring.Boot.tutorial.entity.Department;
import com.dheeraj.Spring.Boot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
   @PostMapping("/department")
   public Department saveDepartment(@RequestBody Department department){
       return departmentService.saveDepartment(department);
   }
}
