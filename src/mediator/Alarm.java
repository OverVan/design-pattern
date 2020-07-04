package mediator;

/**
 * 具体家电-时钟类
 * 
 * @author Van
 */
public class Alarm extends Household {

	/**
	 * 初始化时钟对象同时将其注册给中介者
	 * 
	 * @param name     家电名
	 * @param mediator 中介者对象
	 */
	public Alarm(String name, Mediator mediator) {
		super(name, mediator);
		mediator.registerHousehold(name, this);
	}

	@Override
	public void sendMessage(int state) {
		getMediator().getMessage(state, getName());
	}

	@Override
	public void start() {
		System.out.println("启动闹钟");
	}

	@Override
	public void stop() {
		System.out.println("关闭闹钟");
	}

}
