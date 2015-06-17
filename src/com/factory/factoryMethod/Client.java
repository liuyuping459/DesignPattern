package com.factory.factoryMethod;

/**
 * ��������ģʽ
 * @author liu
 * ����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ
 * ��������ʹһ�����ʵ�����ӳٵ������ࡣ
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
