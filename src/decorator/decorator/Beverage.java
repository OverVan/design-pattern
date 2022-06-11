package decorator.decorator;

/**
 * 抽象的主体产品类-饮料
 * 
 * @author Van
 *
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
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public double cost() {
		return count * price;
	}
}
