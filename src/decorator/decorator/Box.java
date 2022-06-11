package decorator.decorator;

/**
 * 具体的附加产品类-盒子
 * 
 * @author Van
 *
 */
public class Box extends Wrapper {

	public Box(int count, Beverage beverage) {
		super("盒子", 6, count, beverage);
	}

}
