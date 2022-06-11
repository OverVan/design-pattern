package decorator.original;

/**
 * 具体的主体产品-浓咖啡
 * 
 * @author Van
 *
 */
public class Espresso extends Beverage {

	public Espresso(int count, Milk milk, Soy soy) {
		super("浓咖啡", 12, count, milk, soy);
	}
}
