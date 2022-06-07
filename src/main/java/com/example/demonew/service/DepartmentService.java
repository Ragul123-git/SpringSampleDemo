package com.example.demonew.service;

import com.example.demonew.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
