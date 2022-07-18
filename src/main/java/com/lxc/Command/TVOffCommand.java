package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class TVOffCommand implements Command{
    /**
     * 聚合LightReceiver
     */
    TVReceiver tvReceiver ;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
