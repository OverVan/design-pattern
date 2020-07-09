package strategy.ordinary;

/**
 * 北京烤鸭类
 * 
 * @author Van
 */
public class PekingDuck extends Duck {

	@Override
	public void display() {
		System.out.println("这是一只北京烤鸭");
	}

	@Override
	public void swim() {
		System.out.println("北京烤鸭不能游泳");
	}

	@Override
	public void fly() {
		System.out.println("北京烤鸭不能飞");
	}

}
