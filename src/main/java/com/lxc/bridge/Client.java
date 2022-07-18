package com.lxc.bridge;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        UprightPhone uprightPhone = new UprightPhone(new XiaoMi());
        uprightPhone.call();
        uprightPhone.open();
        uprightPhone.close();
    }
}
