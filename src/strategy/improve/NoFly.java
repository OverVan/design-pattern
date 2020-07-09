package strategy.improve;

/**
 * 飞翔实现类-无法飞翔
 * 
 * @author Van
 */
public class NoFly implements Fly {

	@Override
	public void fly() {
		System.out.println("我飞了个寂寞");
	}

}
