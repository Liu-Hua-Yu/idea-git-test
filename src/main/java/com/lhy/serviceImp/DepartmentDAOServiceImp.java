package com.lhy.serviceImp;


import com.lhy.dao.DepartmentDAO;
import com.lhy.entity.Department;
import com.lhy.service.DepartmentDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class DepartmentDAOServiceImp implements DepartmentDAOService {
    @Autowired
    private DepartmentDAO departmentDAO;

    public void setDepartmentDAO(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

    @Override
    public ArrayList<Department> findAllDepartment() {
            ArrayList<Department> allDepartment = departmentDAO.findAllDepartment();
        return allDepartment;
    }

    @Override
    public void updateDepartment(Department department) {
        departmentDAO.updateDepartment(department);
    }


    @Override
    public void addDepartment(Department department) {
        departmentDAO.insertDepartment(department);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS) // 事务管理
    public Department findDepartment(Integer id) {
        Department departmentByID = departmentDAO.findDepartmentByID(id);
        return departmentByID;
    }
}
