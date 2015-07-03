package com.command;

/**
 * 命令2，调构造方法传进来的接收对象的处理方法
 * @author liu
 *
 */
public class Command2 extends Command {

	private Receiver receiver;
	
	public Command2(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.doSomething();
	}

}
