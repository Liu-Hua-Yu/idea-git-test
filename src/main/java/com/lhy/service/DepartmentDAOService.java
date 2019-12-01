package com.lhy.service;

import com.lhy.entity.Department;

import java.util.ArrayList;

public interface DepartmentDAOService {
    // 查询所有部门
    ArrayList<Department> findAllDepartment();
    // 更新部门
    void updateDepartment(Department department);
    // 添加部门
    void addDepartment(Department department);
    // 查询单个部门
    Department findDepartment(Integer id);
}
