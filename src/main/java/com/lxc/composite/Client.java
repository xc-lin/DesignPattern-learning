package com.lxc.composite;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 属性模式 便于管理
 * 对于一些树形结构比较好
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "6566666");

        OrganizationComponent computerCollege = new College("计算机学院", "6666");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", " 6666 ");


        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("网络工程", "网络工程"));
        computerCollege.add(new Department("计算机科学预计数", "计算机科学预计数"));

        infoEngineerCollege.add(new Department("通信工程", " 通信工程"));
        infoEngineerCollege.add(new Department("信息工程", "信息工程"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();
    }
}
