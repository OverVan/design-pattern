package singleton;

/**
 * 懒汉式-同步代码块 synchronized的位置决定了线程的安全与不安全
 */
public class LazySynchronizedBlock {
	// 类加载时，实例不会被创建
	private static LazySynchronizedBlock instance;

	private LazySynchronizedBlock() {

	}

	@Deprecated
	public static LazySynchronizedBlock getInstanceUnsafe() {
		if (instance == null) {
			// 线程不安全
			synchronized (LazySynchronizedBlock.class) {
				instance = new LazySynchronizedBlock();
			}
		}
		return instance;
	}

	// 要用到对象时才创建
	public static LazySynchronizedBlock getInstance() {
		// 对象未创建，只能由Class实例作锁
		synchronized (LazySynchronizedBlock.class) {
			// 首线程已创建单例，后续线程就没必要阻塞了
			if (instance == null) {
				instance = new LazySynchronizedBlock();
			}
		}
		return instance;
	}
}
