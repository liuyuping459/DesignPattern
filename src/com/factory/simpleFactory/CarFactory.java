package com.factory.simpleFactory;

/**
 * 简单工厂类，实现创建者与使用者分离
 * @author liu
 *
 */
public class CarFactory {
	public static Car create(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		}else if ("比亚迪".equals(type)) {
			return new BYD();
		}else {
			return null;
		}
	}
}
