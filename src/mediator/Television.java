package mediator;

/**
 * 具体家电-电视机类
 * 
 * @author Van
 */
public class Television extends Household {

	/**
	 * 初始化咖啡机对象同时将其注册给中介者
	 * 
	 * @param name     家电名
	 * @param mediator 中介者对象
	 */
	public Television(String name, Mediator mediator) {
		super(name, mediator);
		mediator.registerHousehold(name, this);
	}

	@Override
	public void sendMessage(int state) {
		getMediator().getMessage(state, getName());
	}

	@Override
	public void start() {
		System.out.println("启动电视机");
	}

	@Override
	public void stop() {
		System.out.println("关闭电视机");
	}

}
