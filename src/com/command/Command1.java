package com.command;

/**
 * 命令1，执行构造方法传入的接受者对象的处理方法
 * @author liu
 *
 */
public class Command1 extends Command {

	private Receiver receiver;
	
	public Command1(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.doSomething();
	}

}
