package com.lxc.momento.game;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("before");
        gameRole.print();
        Caretaker caretaker = new Caretaker();
        caretaker.add(gameRole.createMomento());

        gameRole.setVit(50);
        gameRole.setDef(50);
        System.out.println("after");
        gameRole.print();
        System.out.println("-----recover------");
        gameRole.recover(caretaker.get(0));
        gameRole.print();

    }
}
