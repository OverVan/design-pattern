package decorator;

/**
 * 装饰者，继承并聚合Drink类，单品即Coffee类的子类为被装饰者
 * 
 * @author Van
 */
public class Decorator extends Drink {

	// 聚合装饰者
	private Drink drink;

	/**
	 * 初始化被装饰者
	 */
	public Decorator(Drink drink) {
		super();
		this.drink = drink;
	}

	/**
	 * 覆盖父类Drink的cost方法
	 */
	@Override
	public float cost() {
		return getPrice();
	}

	@Override
	public String getDescription() {
		return getDescription() + super.getPrice() + drink.getDescription();
	}

}
