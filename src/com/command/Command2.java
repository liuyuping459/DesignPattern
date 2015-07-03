package com.command;

/**
 * ����2�������췽���������Ľ��ն���Ĵ�����
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
