package mediator;

/**
 * 智能家电抽象类
 * 
 * @author Van
 */
public abstract class Household {
	// 家电名
	private String name;
	// 依赖的中介者
	private Mediator mediator;

	public Household(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public Mediator getMediator() {
		return mediator;
	}

	/**
	 * 家电向中介者发送消息
	 * 
	 * @param state 消息码
	 */
	public abstract void sendMessage(int state);

	/**
	 * 开机
	 */
	public abstract void start();

	/**
	 * 关机
	 */
	public abstract void stop();
}
