package com.lhy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) // 支持链式调用
public class Employee {
    private Integer id;
    private String src;
    private String name;
    private Double salary;
    private Integer age;
    private String departmentNumber;
    private String departmentName;

 /*   public Employee() {
    }

    public Employee(Integer id, String src, String name, Double salary, Integer age, String departmentNumber, String departmentName) {
        this.id = id;
        this.src = src;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", src='" + src + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", departmentNumber='" + departmentNumber + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }*/
}
