package com.singleton;

import java.lang.reflect.Constructor;

/**
 * 用工厂方法实现单例
 * @author liu
 * 当然要通过正常的渠道，其他类通过反射也是可以获得单例类的其他对象的。
 */
public class SingletonDemo7_2 {
	private static SingletonDemo7_1 demo7_1;
	
	static{
		try {
			Class clazz = Class.forName(SingletonDemo7_1.class.getName());
			Constructor<SingletonDemo7_1> constructor = clazz.getEnclosingConstructor();
			constructor.setAccessible(true);
			demo7_1 = constructor.newInstance();
		} catch(Exception e) {
			System.out.println("报错");
		}
	}
	
	public SingletonDemo7_1 getSingletonDemo7_1() {
		return demo7_1;
	}
}
