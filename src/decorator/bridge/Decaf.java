package decorator.bridge;

/**
 * 具体的主体产品-低因咖啡
 */
public class Decaf extends Beverage {

	public Decaf(int count) {
		super("低因咖啡", 10, count);
	}

}
