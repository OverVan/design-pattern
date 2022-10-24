package decorator.bridge;

/**
 * 抽象层-附加产品抽象类-配料
 */
public abstract class Topping {
	// 想象一下，这里使用列表逻辑上有问题，但不用列表不管对主体还是附加，都只能买一种单品
	private Beverage beverage;
	// 注意到成员跟主体产品的是一样的，自然想到继承
	private String description;
	private double price;
	private int count;

	public Topping(Beverage beverage, String description, double price, int count) {
		super();
		this.beverage = beverage;
		this.description = description;
		this.price = price;
		this.count = count;
	}

	public String getDescription() {
		return beverage.getDescription() + description + price + '\u00D7' + count;
	}

	public double cost() {
		return count * price + beverage.cost();
	}
}
