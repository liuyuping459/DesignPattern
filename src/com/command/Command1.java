package com.command;

/**
 * ����1��ִ�й��췽������Ľ����߶���Ĵ�����
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
