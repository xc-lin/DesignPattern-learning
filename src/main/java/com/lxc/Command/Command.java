package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */

/**
 * 创建命令接口
 */
public interface Command {
    /**
     * 执行动作
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
