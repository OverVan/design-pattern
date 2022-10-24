package decorator.decorator;

/**
 * 具体的附加产品类-袋子
 */
public class Bag extends Wrapper {

	public Bag(int count, Beverage beverage) {
		super("袋子", 5, count, beverage);
	}

}
