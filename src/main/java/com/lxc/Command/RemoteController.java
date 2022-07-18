package com.lxc.Command;

/**
 * @author Frank_lin
 * @date 2022/7/17
 */
public class RemoteController {
    // 开按钮的命令数组

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();

        }

    }
    // 给我们的按钮设置需要的命令

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开的按钮

    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        // 记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }


    // 按下撤销
    public void undoButton(){
        undoCommand.undo();
    }


}
