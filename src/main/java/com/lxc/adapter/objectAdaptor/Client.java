package com.lxc.adapter.objectAdaptor;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
