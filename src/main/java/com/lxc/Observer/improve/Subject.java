package com.lxc.Observer.improve;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public interface Subject {
    void registerObserver(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
