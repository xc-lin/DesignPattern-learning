package com.lxc.proxy.cglibProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        TeacherDao instance = (TeacherDao) proxyFactory.getInstance();
        String teach = instance.teach();
        System.out.println(teach);
        System.out.println("*****************");
        instance.sayHello("linxc");

    }
}
