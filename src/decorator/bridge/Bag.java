package decorator.bridge;

/**
 * 附加单品类-袋子
 */
public class Bag extends Wrapper {

	public Bag(Topping topping, int count) {
		super(topping, "袋子", 5., count);
	}

}
