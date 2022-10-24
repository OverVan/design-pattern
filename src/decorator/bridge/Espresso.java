package decorator.bridge;

/**
 * 具体的主体产品-浓咖啡
 */
public class Espresso extends Beverage {

	public Espresso(int count) {
		super("浓咖啡", 12, count);
	}

}
