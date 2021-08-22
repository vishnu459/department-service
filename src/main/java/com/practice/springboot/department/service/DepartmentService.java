package com.practice.springboot.department.service;

import com.practice.springboot.department.entity.Department;
import com.practice.springboot.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(final Department department) {
        log.info("Inside saveDepartment method of DepartmentService..");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(final Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService..");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
