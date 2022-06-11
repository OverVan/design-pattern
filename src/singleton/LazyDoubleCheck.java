package singleton;

/**
 * 懒汉式-双重检查
 * 
 * @author Van
 *
 */
public class LazyDoubleCheck {
	// 熟悉volatile关键字
	private static volatile LazyDoubleCheck instance;

	private LazyDoubleCheck() {

	}

	/**
	 * 线程安全，且效率较高
	 * 
	 * @return
	 */
	public static LazyDoubleCheck getInstance() {
		// 一重检查，此处可能有线程卡住
		if (instance == null) {
			synchronized (LazyDoubleCheck.class) {
				// 二重检查，此处线程即使卡住也是独占处理机
				if (instance == null)
					instance = new LazyDoubleCheck();
			}
		}
		return instance;
	}
}
