package com.lxc.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class InfoCollege implements College {
    List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("aaa", "aaa");
        addDepartment("bbb", "bbb");
        addDepartment("ccc", "ccc");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
