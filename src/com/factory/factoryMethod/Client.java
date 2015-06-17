package com.factory.factoryMethod;

/**
 * 工厂方法模式
 * @author liu
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到其子类。
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new HumanFactory();
		
		Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		
		Human blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		
		Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
	}

}
