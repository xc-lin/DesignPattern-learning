package com.lxc.iterator;

import java.util.Iterator;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public interface College {

    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator createIterator();


}
