package mediator;

/**
 * 具体家电-咖啡机类
 * 
 * @author Van
 */
public class CoffeeMachine extends Household {

	/**
	 * 初始化咖啡机对象同时将其注册给中介者
	 * 
	 * @param name     家电名
	 * @param mediator 中介者对象
	 */
	public CoffeeMachine(String name, Mediator mediator) {
		super(name, mediator);
		mediator.registerHousehold(name, this);
	}

	@Override
	public void sendMessage(int state) {
		getMediator().getMessage(state, getName());
	}

	@Override
	public void start() {
		System.out.println("启动咖啡机");
	}

	@Override
	public void stop() {
		System.out.println("关闭咖啡机");
	}

}
