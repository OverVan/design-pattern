package strategy.ordinary;

/**
 * 野鸭子类
 * 
 * @author Van
 */
public class WildDuck extends Duck {

	@Override
	public void display() {
		System.out.println("这是一只野鸭子");
	}

	@Override
	public void swim() {
		System.out.println("野鸭子在游泳");
	}

	@Override
	public void fly() {
		System.out.println("野鸭子在飞");
	}

}
