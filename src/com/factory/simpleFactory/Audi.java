package com.factory.simpleFactory;

public class Audi implements Car {

	@Override
	public void wheel() {
		System.out.println("���Ӵ�");
	}

	@Override
	public void engine() {
		System.out.println("����������");
	}

}
