package com.factory.simpleFactory;

/**
 * �򵥹����࣬ʵ�ִ�������ʹ���߷���
 * @author liu
 *
 */
public class CarFactory {
	public static Car create(String type) {
		if ("�µ�".equals(type)) {
			return new Audi();
		}else if ("���ǵ�".equals(type)) {
			return new BYD();
		}else {
			return null;
		}
	}
}
