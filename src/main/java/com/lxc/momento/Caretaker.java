package com.lxc.momento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Caretaker {
    private List<Momento> momentos = new ArrayList<>();

    public void add(Momento momento) {
        momentos.add(momento);
    }

    public Momento get(int index){
        return momentos.get(index);
    }
}
