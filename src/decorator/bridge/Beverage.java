package decorator.bridge;

/**
 * 实现层（桥最右端）-抽象的主体产品类-饮料
 */
public abstract class Beverage {
	private String description;
	private double price;
	private int count;

	public Beverage(String description, double price, int count) {
		super();
		this.description = description;
		this.price = price;
		this.count = count;
	}

	public String getDescription() {
		return description + price + '\u00D7' + count;
	}

	public double cost() {
		return count * price;
	}
}
