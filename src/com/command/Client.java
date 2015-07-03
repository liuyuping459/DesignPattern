package com.command;

/**
 * 调用
 * @author liu
 *
 */
public class Client {
	public static void main(String[] args) {
		//调用者
		Invoker invoker	= new Invoker();
		//接受者
		Receiver receiver = new Receiver1();
		//发生给接收者的命令
		Command command = new Command1(receiver);
		//把命令交给调用者去执行
		invoker.setCommand(command);
		invoker.action();
	}
}
