package singleton;

/**
 * 饿汉式-静态常量
 * 
 * @author Van
 *
 */
public class HungryStaticFinal {
	// final关键字不必要
	private final static HungryStaticFinal INSTANCE = new HungryStaticFinal();
	// 类一加载，对象就被创建 JVM解决线程安全问题，保证类仅加载一次

	private HungryStaticFinal() {

	}

	public static HungryStaticFinal getInstance() {
		return INSTANCE;
	}
}
