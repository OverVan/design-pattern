package decorator.anotherMine;

/**
 * 意大利咖啡类，继承咖啡类
 * 
 * @author Van
 */
public class Espresso extends Coffee {

	public Espresso(float price) {
		super(price);
		setDescription("意大利咖啡");
	}

}
