package decorator.bridge;

/**
 * 抽象层-附加产品抽象类-包装
 */
public abstract class Wrapper {
	private Topping topping;
	// 成员高度重复，凸显装饰器模式的优势
	private String description;
	private double price;
	private int count;

	public Wrapper(Topping topping, String description, double price, int count) {
		super();
		this.topping = topping;
		this.description = description;
		this.price = price;
		this.count = count;
	}

	public String getDescription() {
		return topping.getDescription() + description + price + '\u00D7' + count;
	}

	public double cost() {
		return count * price + topping.cost();
	}
}
