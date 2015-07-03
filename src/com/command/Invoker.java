package com.command;

/**
 * 调用者，接收命令，执行命令
 * @author liu
 *
 */
public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
}
