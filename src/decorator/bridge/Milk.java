package decorator.bridge;

/**
 * 具体的附加产品类-牛奶
 * 
 * @author Van
 *
 */
public class Milk extends Topping {

	public Milk(int count) {
		super("牛奶", 3, count);
	}

}
