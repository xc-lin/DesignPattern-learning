package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class LightOnCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
