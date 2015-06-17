package com.singleton;

/**
 * ��̬�ڲ�����ʽ
 * @author liu
 * �����������أ�����get�Ż�����ڲ��࣬���������̰߳�ȫ�ģ���ʱ�������̰߳�ȫ��
 */
public class SingletonDemo4 {
	private SingletonDemo4() {
		
	}
	
	private static class Instance {
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public SingletonDemo4 getSingletonDemo4() {
		return Instance.instance;
	}
}
