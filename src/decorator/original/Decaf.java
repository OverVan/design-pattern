package decorator.original;

/**
 * 具体的主体产品-低因咖啡
 * 
 * @author Van
 *
 */
public class Decaf extends Beverage {

	public Decaf(int count, Milk milk, Soy soy) {
		super("低因咖啡", 10, count, milk, soy);
	}

}
