package com.singleton;

/**
 * 静态内部类形式
 * @author liu
 * 不会立即加载，调用get才会加载内部类，加载类是线程安全的，延时加载又线程安全。
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
