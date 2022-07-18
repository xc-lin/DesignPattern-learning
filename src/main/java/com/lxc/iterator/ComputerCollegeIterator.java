package com.lxc.iterator;

import java.util.Iterator;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class ComputerCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    // 默认不实现
    @Override
    public void remove() {

    }
}
