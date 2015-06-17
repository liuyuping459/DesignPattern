package com.factory.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Car audi = CarFactory.create("°ÂµÏ");
		Car byd = CarFactory.create("±ÈÑÇµÏ");
		
		audi.wheel();
		byd.wheel();
	}
	
}
