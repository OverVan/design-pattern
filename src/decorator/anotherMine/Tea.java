package decorator.anotherMine;

/**
 * 茶类，继承饮料类
 * 
 * @author Van
 */
public class Tea extends Drink {

	public Tea(float price) {
		super(price);
	}

	/**
	 * 只算单价
	 */
	@Override
	public float cost() {
		System.out.println("1 杯" + getDescription());
		return getPrice();
	}

}
