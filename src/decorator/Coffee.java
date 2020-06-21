package decorator;

/**
 * 咖啡类
 * 
 * @author Van
 */
public class Coffee extends Drink {

	/**
	 * 覆盖父类Drink的cost方法
	 */
	@Override
	public float cost() {
		return getPrice();
	}

}
