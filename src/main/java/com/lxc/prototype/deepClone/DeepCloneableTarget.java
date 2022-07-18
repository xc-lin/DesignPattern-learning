package com.lxc.prototype.deepClone;

import java.io.Serializable;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
