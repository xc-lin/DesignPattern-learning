package com.lxc.momento.game;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Momento {
    private int vit;
    private int def;

    public Momento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
