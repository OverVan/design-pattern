package decorator.decorator;

/**
 * 附加产品家族-包装
 */
public abstract class Wrapper extends Beverage {
	private Beverage beverage;

	public Wrapper(String description, double price, int count, Beverage beverage) {
		super(description, price, count);
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return getCount() * getPrice() + beverage.cost();
	}

	@Override
	public String getDescription() {
		// 越新附加的产品的描述越靠前
		return super.getDescription() + beverage.getDescription();
	}
}
