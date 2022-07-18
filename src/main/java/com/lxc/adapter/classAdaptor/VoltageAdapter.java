package com.lxc.adapter.classAdaptor;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dstV =src- 215;
        return dstV;
    }
}
