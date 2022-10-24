package decorator.decorator;

/**
 * 抽象的附加产品类，继承并聚合抽象的主体产品类
 */
public abstract class Topping extends Beverage {

	private Beverage beverage;

	/**
	 * 每新增一个装饰者，都要预留beverage参数
	 * 
	 * @param description
	 * @param price
	 * @param count
	 * @param beverage    嵌套调用构造器的关键
	 */
	public Topping(String description, double price, int count, Beverage beverage) {
		super(description, price, count);
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return getCount() * getPrice() + beverage.cost();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + beverage.getDescription();
	}

}
