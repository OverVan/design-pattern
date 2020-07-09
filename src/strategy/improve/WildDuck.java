package strategy.improve;

/**
 * 野鸭子类
 * 
 * @author Van
 */
public class WildDuck extends Duck {

	public WildDuck() {
		super(new WellFly(), new GaGaQuack());
	}

	@Override
	public void display() {
		System.out.println("这是一只野鸭子");
	}

}
