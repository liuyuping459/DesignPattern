package com.singleton;

/**
 * ˫�ؼ����
 * @author liu
 * ͬ������if�ڲ�����һ��ͬ����֮����ͬ����
 * JVM�ײ�ʵ�ֵ����⣬��ʱִ��˳�������⡣
 * ������ʽ����ߡ�
 */
public class SingletonDemo3 {
	private static SingletonDemo3 instance = null;
	
	public SingletonDemo3 getSingletonDemo3() {
		if (null == instance) {
			SingletonDemo3 demo = null;
			synchronized(SingletonDemo3.class) {
				demo = instance;
				if (null == demo) {
					synchronized(SingletonDemo3.class) {
						if (null == demo) {
							demo = new SingletonDemo3();
						}
					}
				}
				instance = demo;
			}
		}
		return instance;
	}
	
	private SingletonDemo3() {
		
	}
}
