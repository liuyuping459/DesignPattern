package com.singleton;

/**
 * 单例防止放射和反序列化破坏
 * @author liu
 *
 */
public class SingletonDemo6 {
	private static SingletonDemo6 instance = null;
	
	//反射是setAccessible跳过权限，调用构造器，若instance对象不为空，则抛出异常。
	private SingletonDemo6() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	//反序列化时，有readResolve方法，则直接返回此方法指定的对象，而不创建新的对象。
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
