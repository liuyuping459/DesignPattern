package com.singleton;

/**
 * 懒汉式
 * @author liu
 * 类初始化时不初始化这个对象，延时加载，真要用时再加载
 */
public class SingletonDeom1 {
	private static SingletonDeom1 instance;
	
	private SingletonDeom1() {
	}
	
	//方法有同步，效率略低
	public synchronized SingletonDeom1 getInstance() {
		if (null == instance) {
			instance = new SingletonDeom1();
			return instance;
		}
		return instance;
	}
}
