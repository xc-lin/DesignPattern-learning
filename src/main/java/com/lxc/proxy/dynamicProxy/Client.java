package com.lxc.proxy.dynamicProxy;

import com.lxc.proxy.staticProxy.TeacherDaoProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello("linxc");
    }
}
