package com.lxc.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个代理对象
     * 是target对象的代理对象
     * @return
     */
    public Object getInstance(){
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置一个父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 动态代理开始，。。。。");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib 动态代理结束，。。。。");

        return invoke;
    }
}
