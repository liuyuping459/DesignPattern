package com.command;

/**
 * ����
 * @author liu
 *
 */
public class Client {
	public static void main(String[] args) {
		//������
		Invoker invoker	= new Invoker();
		//������
		Receiver receiver = new Receiver1();
		//�����������ߵ�����
		Command command = new Command1(receiver);
		//�������������ȥִ��
		invoker.setCommand(command);
		invoker.action();
	}
}
