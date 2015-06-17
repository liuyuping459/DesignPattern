package com.singleton;

import java.lang.reflect.Constructor;

/**
 * �ù�������ʵ�ֵ���
 * @author liu
 * ��ȻҪͨ��������������������ͨ������Ҳ�ǿ��Ի�õ��������������ġ�
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
			System.out.println("����");
		}
	}
	
	public SingletonDemo7_1 getSingletonDemo7_1() {
		return demo7_1;
	}
}
