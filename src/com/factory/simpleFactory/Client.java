package com.factory.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Car audi = CarFactory.create("�µ�");
		Car byd = CarFactory.create("���ǵ�");
		
		audi.wheel();
		byd.wheel();
	}
	
}
