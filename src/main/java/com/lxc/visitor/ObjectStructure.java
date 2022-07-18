package com.lxc.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class ObjectStructure {

    // 维护了一个集合
    private List<Person> persons =new LinkedList<>();

    public void attach(Person p){
        persons.add(p);
    }

    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }


}
