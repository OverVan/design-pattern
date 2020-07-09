package strategy.improve;

/**
 * 飞翔实现类-短于飞翔
 * 
 * @author Van
 */
public class PoorFly implements Fly {

	@Override
	public void fly() {
		System.out.println("我飞得很垃圾");
	}

}
