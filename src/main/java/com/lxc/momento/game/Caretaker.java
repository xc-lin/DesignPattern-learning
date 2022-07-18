package com.lxc.momento.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Caretaker {
    private List<Momento> momentos = new ArrayList<>();
    private Map<String,List<Momento>> rolesMomentos ;

    public void add(Momento momento) {
        momentos.add(momento);
    }

    public Momento get(int index){
        return momentos.get(index);
    }
}
