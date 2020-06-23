package decorator.anotherMine;

/**
 * 美式咖啡类，继承咖啡类
 * 
 * @author Van
 */
public class LongBlack extends Coffee {

	public LongBlack(float price) {
		super(price);
		setDescription("美式咖啡");
	}

}
