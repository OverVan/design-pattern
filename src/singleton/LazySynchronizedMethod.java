package singleton;

/**
 * 懒汉式-同步方法
 */
public class LazySynchronizedMethod {
	// 类加载时，实例不会被创建
	private static LazySynchronizedMethod instance;

	private LazySynchronizedMethod() {

	}

	// 线程调用到此方法才创建对象，且互斥执行，线程安全，效率不够高
	public static synchronized LazySynchronizedMethod getInstance() {
		if (instance == null)
			instance = new LazySynchronizedMethod();
		return instance;
	}
}
