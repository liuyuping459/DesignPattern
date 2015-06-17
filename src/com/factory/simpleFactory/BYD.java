package com.factory.simpleFactory;

public class BYD implements Car {

	@Override
	public void wheel() {
		System.out.println("轮子小");
	}

	@Override
	public void engine() {
		System.out.println("发动机四缸");
	}

}
