package decorator.anotherMine;

/**
 * 咖啡类，继承饮料类
 * 
 * @author Van
 */
public class Coffee extends Drink {

	public Coffee(float price) {
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
