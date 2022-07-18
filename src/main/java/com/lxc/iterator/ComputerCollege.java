package com.lxc.iterator;

import java.util.Iterator;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class ComputerCollege implements College,Iterable {
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java","java");
        addDepartment("php","php");
        addDepartment("python","python");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public Iterator iterator() {
        return new ComputerCollegeIterator(departments);
    }
}
