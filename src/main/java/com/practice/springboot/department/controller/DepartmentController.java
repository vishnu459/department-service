package com.practice.springboot.department.controller;

import com.practice.springboot.department.entity.Department;
import com.practice.springboot.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save-department")
    public Department saveDepartment(@RequestBody final Department department) {
        log.info("Inside saveDepartment method of DepartmentController..");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/find-department-by-id/{departmentId}")
    public Department findDepartmentById(
            @PathVariable(name = "departmentId") final Long departmentId
    ) {
        log.info("Inside findDepartmentById method of DepartmentController.." + departmentId);
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/find-department-by-id-param")
    public Department findDepartmentByIdParam(
            @RequestParam(name = "departmentId") final Long departmentId
    ) {
        log.info("Inside findDepartmentById method of DepartmentController.." + departmentId);
        return departmentService.findDepartmentById(departmentId);
    }
}
