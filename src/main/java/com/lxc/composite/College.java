package com.lxc.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class College extends OrganizationComponent{

    public College(String name, String des) {
        super(name, des);
    }
    List<OrganizationComponent> organizationComponentList =new ArrayList<>();

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
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
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }
}
