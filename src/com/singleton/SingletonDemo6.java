package com.singleton;

/**
 * ������ֹ����ͷ����л��ƻ�
 * @author liu
 *
 */
public class SingletonDemo6 {
	private static SingletonDemo6 instance = null;
	
	//������setAccessible����Ȩ�ޣ����ù���������instance����Ϊ�գ����׳��쳣��
	private SingletonDemo6() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	//�����л�ʱ����readResolve��������ֱ�ӷ��ش˷���ָ���Ķ��󣬶��������µĶ���
	private Object readResolve() {
		return instance;
	}
	
	public synchronized SingletonDemo6 getSingletonDemo6() {
		if (null == instance) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
}
