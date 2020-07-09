package strategy.ordinary;

/**
 * 玩具鸭子类
 * 
 * @author Van
 */
public class ToyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("这是一只玩具鸭子");
	}

	@Override
	public void swim() {
		System.out.println("玩具鸭子不能游泳");
	}

	@Override
	public void fly() {
		System.out.println("玩具鸭子不能飞");
	}

}
