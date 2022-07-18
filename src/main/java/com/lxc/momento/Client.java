package com.lxc.momento;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("睡眠中");
        Momento momento = originator.saveStateMomento();
        // 保存了当前状态
        caretaker.add(momento);

        originator.setState("冷却中");
        caretaker.add(originator.saveStateMomento());

        originator.setState("攻击中");
        caretaker.add(originator.saveStateMomento());

        // 希望恢复到第一个状态

        System.out.println(originator.getState());
        originator.getStateFromMomento(caretaker.get(1));
        System.out.println(originator.getState());

    }
}
