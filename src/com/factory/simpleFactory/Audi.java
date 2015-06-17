package com.factory.simpleFactory;

public class Audi implements Car {

	@Override
	public void wheel() {
		System.out.println("轮子大");
	}

	@Override
	public void engine() {
		System.out.println("发动机六缸");
	}

}
