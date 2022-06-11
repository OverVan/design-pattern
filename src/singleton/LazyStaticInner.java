package singleton;

/**
 * 懒加载-静态内部类
 * 
 * @author Van
 *
 */
public class LazyStaticInner {
	private LazyStaticInner() {

	}

	/**
	 * 去掉static，看等号右边的实例化，要求外部类实例存在
	 * 
	 * @author Van
	 *
	 */
	static class InnerSingleton {
		// JVM保证类仅加载一次，线程安全，加载的时候就执行等号右边的实例化
		private static final InnerSingleton INSTANCE = new InnerSingleton();

		private InnerSingleton() {

		}
	}

	public static InnerSingleton getInstance() {
		// 延迟加载，用到内部类的公有成员
		return InnerSingleton.INSTANCE;
	}
}
