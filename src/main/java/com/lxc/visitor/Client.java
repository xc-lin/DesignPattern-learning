package com.lxc.visitor;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());

        SuccessAction successAction = new SuccessAction();

       objectStructure.display(successAction);
    }
}
