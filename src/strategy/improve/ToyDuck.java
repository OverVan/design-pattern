package strategy.improve;

/**
 * 玩具鸭子类
 * 
 * @author Van
 */
public class ToyDuck extends Duck {

	public ToyDuck() {
		super(new NoFly(), new GeGeQuack());
	}

	@Override
	public void display() {
		System.out.println("这是一只玩具鸭子");
	}

}
