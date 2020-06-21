package decorator;

/**
 * 意大利咖啡类
 * 
 * @author Van
 */
public class Espresso extends Coffee {

	/**
	 * 初始化单品描述和单价
	 */
	public Espresso() {
		setDescription("意大利咖啡");
		setPrice(6.0f);
	}

}
