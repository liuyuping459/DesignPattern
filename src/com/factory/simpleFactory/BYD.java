package com.factory.simpleFactory;

public class BYD implements Car {

	@Override
	public void wheel() {
		System.out.println("����С");
	}

	@Override
	public void engine() {
		System.out.println("�������ĸ�");
	}

}
