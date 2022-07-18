package com.lxc.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        colleges.add(computerCollege);
        colleges.add(infoCollege);
        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();

    }
}
