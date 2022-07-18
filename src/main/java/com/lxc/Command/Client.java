package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成通过遥控器，对电灯的操作
        LightReceiver lightReceiver = new LightReceiver();
        // 闯将电灯开关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给我们的遥控器设置命令，比如no = 0 是电灯的开和关按钮
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButton();

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButton();
    }
}
