package com.factory.factoryMethod;

/**
 * 具体生产对象的工厂，生产什么对象由传入的参数决定。
 * @author liu
 *
 */
public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return (T) human;
	}

}
