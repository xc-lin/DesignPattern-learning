package com.lxc.flyingWeight;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class ConcreteWebsite extends Website{
    // 共享的部分，内部状态
    private String type = "";


    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(type+" "+user.getName() );
    }
}
