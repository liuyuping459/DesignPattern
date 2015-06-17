package com.singleton;

/**
 * ����ʽ
 * @author liu
 * �����ʱ������ʼ���������������̰߳�ȫ��û����ʱ����
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance = new SingletonDemo2();
	
	private SingletonDemo2() {
	}
	
	//û��ͬ����Ч���Ը�
	public SingletonDemo2 getInstance() {
		return instance;
	}
}
