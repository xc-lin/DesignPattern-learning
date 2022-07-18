package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class LightOffCommand implements Command{
    /**
     * 聚合LightReceiver
     */
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
