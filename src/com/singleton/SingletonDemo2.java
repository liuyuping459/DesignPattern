package com.singleton;

/**
 * 饿汉式
 * @author liu
 * 类加载时立即初始化这个对象，类加载线程安全，没有延时加载
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance = new SingletonDemo2();
	
	private SingletonDemo2() {
	}
	
	//没有同步，效率略高
	public SingletonDemo2 getInstance() {
		return instance;
	}
}
