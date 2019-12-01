package com.lhy.dao;


import com.lhy.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DepartmentDAO {
    // 部门的操作 添加 更改 查找单个，所有
    void insertDepartment(Department department);

    void updateDepartment(Department department);

    Department findDepartmentByID(Integer id);

    ArrayList<Department> findAllDepartment();
}
