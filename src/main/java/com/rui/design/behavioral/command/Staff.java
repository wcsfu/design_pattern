package com.rui.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();


    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.excute();
        }
        commandList.clear();
    }
}
