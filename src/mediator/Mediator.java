package mediator;

/**
 * 中介者抽象类-控制各种家电对象
 * 
 * @author Van
 */
public abstract class Mediator {
	/**
	 * 接收家电对象发来的消息
	 * 
	 * @param state 消息码
	 * @param name  家电名
	 */
	public abstract void getMessage(int state, String name);

	/**
	 * 注册一个家电对象
	 * 
	 * @param name      家电名
	 * @param household 家电对象
	 */
	public abstract void registerHousehold(String name, Household household);

	/**
	 * 发送消息
	 * 
	 * @param state 消息码
	 */
	public abstract void sendMessage(int state);
}
