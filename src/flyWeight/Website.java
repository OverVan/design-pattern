package flyWeight;

/**
 * 抽象网站类
 * 
 * @author Van
 */
public abstract class Website {
	/**
	 * 指明由谁使用何种网站
	 */
	public abstract void use(User user);
}
