package decorator.decorator;

/**
 * 具体的附加产品类-豆浆
 * 
 * @author Van
 *
 */
public class Soy extends Topping {

	public Soy(int count, Beverage beverage) {
		super("豆浆", 2, count, beverage);
	}

}
