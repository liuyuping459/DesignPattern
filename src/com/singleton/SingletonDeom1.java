package com.singleton;

/**
 * ����ʽ
 * @author liu
 * ���ʼ��ʱ����ʼ�����������ʱ���أ���Ҫ��ʱ�ټ���
 */
public class SingletonDeom1 {
	private static SingletonDeom1 instance;
	
	private SingletonDeom1() {
	}
	
	//������ͬ����Ч���Ե�
	public synchronized SingletonDeom1 getInstance() {
		if (null == instance) {
			instance = new SingletonDeom1();
			return instance;
		}
		return instance;
	}
}
