package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class TVOnCommand implements Command{
    /**
     * 聚合LightReceiver
     */
    TVReceiver tvReceiver ;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
