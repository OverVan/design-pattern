package decorator.bridge;

/**
 * 实现层-抽象的附加产品类-配料
 * 
 * @author Van
 *
 */
public abstract class Topping {
	// 注意到属性跟主体产品的是一样的，可以继承啊
	private String description;
	private double price;
	private int count;

	public Topping(String description, double price, int count) {
		super();
		this.description = description;
		this.price = price;
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return count * price;
	}
}
