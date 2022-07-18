package com.lxc.momento;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 便携一个方法，可以保存一个状态对象Momento
    // 因此便携一个方法，返回Momento
    public Momento saveStateMomento(){
        return new Momento(state);
    }

    // 得到
    public void getStateFromMomento(Momento momento){
        state = momento.getState();
    }

}
