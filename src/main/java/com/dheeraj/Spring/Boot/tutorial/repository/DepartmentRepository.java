package com.dheeraj.Spring.Boot.tutorial.repository;

import com.dheeraj.Spring.Boot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
