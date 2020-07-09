package strategy.improve;

/**
 * 鸭子类
 * 
 * @author Van
 */
public abstract class Duck {
	// 飞翔和鸣叫行为
	private Fly fly;
	private Quack quack;

	public Duck(Fly fly, Quack quack) {
		this.fly = fly;
		this.quack = quack;
	}

	public Fly getFly() {
		return fly;
	}

	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public Quack getQuack() {
		return quack;
	}

	public void setQuack(Quack quack) {
		this.quack = quack;
	}

	/**
	 * 展示信息
	 */
	public abstract void display();

	/**
	 * 飞翔
	 */
	public void fly() {
		if (fly != null)
			fly.fly();
	}

	public void quack() {
		if (quack != null)
			quack.quack();
	}
}
