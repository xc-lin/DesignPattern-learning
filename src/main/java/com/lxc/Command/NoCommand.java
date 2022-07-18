package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */

/**
 * 没有任何命令，空执行，用于初始化所有命令。当调用空命令是，对象什么都不做
 * 可以省掉空判断
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
