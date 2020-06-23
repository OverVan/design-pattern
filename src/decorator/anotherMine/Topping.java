package decorator.anotherMine;

/**
 * 配品类，继承并组合饮料类，充当装饰器Decorator
 * 
 * @author Van
 */
public class Topping extends Drink {

	// 单品
	private Drink drink;
	// 配品数量
	private int count;

	public Topping(float price, Drink drink, int count) {
		super(price);
		this.drink = drink;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * 算总价
	 */
	@Override
	public float cost() {
		// 打印单品并取价格
		float drinkCost = drink.cost();
		// 打印配品添加情况
		System.out.println(getCount() + " 份" + getDescription());
		// 总价
		return drinkCost + getCount() * getPrice();
	}

}
