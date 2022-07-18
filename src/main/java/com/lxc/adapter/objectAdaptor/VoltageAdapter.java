package com.lxc.adapter.objectAdaptor;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class VoltageAdapter implements Voltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dstV =src- 215;
        return dstV;
    }
}
