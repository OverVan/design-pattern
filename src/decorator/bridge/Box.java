package decorator.bridge;

/**
 * 附加单品类-盒子
 */
public class Box extends Wrapper {

	public Box(Topping topping, int count) {
		super(topping, "盒子", 6., count);
	}

}
