package com.lxc.momento.game;

import com.lxc.mediator.Mediator;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class GameRole {
    private int vit;
    private int def;


    // 创建Memento
    public Momento createMomento(){
        return new Momento(vit,def);
    }


    public void recover(Momento momento){
       this.vit = momento.getVit();
       this.def = momento.getDef();
    }

    public void print(){
        System.out.println(vit+" "+def);
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
