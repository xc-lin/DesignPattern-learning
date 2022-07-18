package com.lxc.proxy.dynamicProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
