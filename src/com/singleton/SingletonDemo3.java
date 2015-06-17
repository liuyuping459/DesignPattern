package com.singleton;

/**
 * 双重检查锁
 * @author liu
 * 同步快在if内部，第一次同步，之后不用同步。
 * JVM底层实现的问题，有时执行顺序会出问题。
 * 比懒汉式略提高。
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
