package com.lxc.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class OutputImpl {
    // 学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println(next);
            printDepartment(next.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department) iterator.next();
            System.out.println(next);
        }
    }
}
