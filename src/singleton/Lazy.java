package singleton;

/**
 * 原始懒汉式
 */
public class Lazy {
	// 类加载时，实例不会被创建
	private static Lazy instance;

	private Lazy() {

	}

	// 调用到此方法即要用到对象时才创建
	public static Lazy getInstance() {
		// 线程不安全
		if (instance == null)
			instance = new Lazy();
		return instance;
	}
}
