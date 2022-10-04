package singleton;

/**
 * 饿汉式-静态代码块
 */
public class HungryStaticBlock {
	// 线程安全
	private static HungryStaticBlock instance;

	// 静态代码块
	static {
		// 类一加载，对象就被创建
		instance = new HungryStaticBlock();
	}

	private HungryStaticBlock() {

	}

	public static HungryStaticBlock getInstance() {
		return instance;
	}
}
