package com.lxc.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index>=departments.size()-1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {
        // do nothing
    }
}
