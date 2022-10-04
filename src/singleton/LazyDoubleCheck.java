package singleton;

/**
 * 懒汉式-双重检查
 * 
 * @author Van
 *
 */
public class LazyDoubleCheck {
	// volatile关键字
	private static volatile LazyDoubleCheck instance;

	private LazyDoubleCheck() {

	}

	/**
	 * 线程安全，且效率较高
	 * 
	 * @return
	 */
	public static LazyDoubleCheck getInstance() {
		// 一重检查，后续线程不会执行同步代码块，也不会阻塞，直接返回
		if (instance == null) {
			synchronized (LazyDoubleCheck.class) {
				// 二重检查，同步代码块只由首线程执行一次
				if (instance == null)
					instance = new LazyDoubleCheck();
			}
		}
		return instance;
	}
}
