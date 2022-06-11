package decorator.original;

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
	private Milk milk;
	private Soy soy;

	public Beverage(String description, double price, int count, Milk milk, Soy soy) {
		super();
		this.description = description;
		this.price = price;
		this.count = count;
		this.milk = milk;
		this.soy = soy;
	}

	public boolean hasMilk() {
		return !(milk == null);
	}

	public boolean hasSoy() {
		return !(soy == null);
	}

	public String getDescription() {
		return (hasMilk() ? milk.getDescription() : "") + (hasSoy() ? soy.getDescription() : "") + description;
	}

	public double cost() {
		// 简便起见，就不用BigDecimal了
		return (hasMilk() ? milk.cost() : 0) + (hasSoy() ? soy.cost() : 0) + price * count;
	}
}
