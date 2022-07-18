package com.lxc.proxy.cglibProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class TeacherDao {
    public String  teach() {
        System.out.println("老师授课中1111...");
        return "teach";
    }

    public void sayHello(String name) {
        System.out.println("hello1111" + name);
    }
}
