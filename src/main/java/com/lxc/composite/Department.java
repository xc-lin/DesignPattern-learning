package com.lxc.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());

    }
}
