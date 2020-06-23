package decorator.anotherMine;

/**
 * 绿茶类，继承茶类
 * 
 * @author Van
 */
public class GreenTea extends Tea {

	public GreenTea(float price) {
		super(price);
		setDescription("绿茶");
	}

}
