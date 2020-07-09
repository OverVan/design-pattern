package strategy.improve;

/**
 * 北京烤鸭类
 * 
 * @author Van
 */
public class PekingDuck extends Duck {

	public PekingDuck() {
		super(new NoFly(), new NoQuack());
	}

	@Override
	public void display() {
		System.out.println("这是一只北京烤鸭");
	}

}
