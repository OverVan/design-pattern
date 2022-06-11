package singleton;

/**
 * 懒汉式-线程不安全，同步代码块
 * 
 * @author Van
 *
 */
public class LazySynchronizedBlock {
	// 类加载时，实例不会被创建
	private static LazySynchronizedBlock instance;

	private LazySynchronizedBlock() {

	}

	// 要用到对象时才创建
	public static LazySynchronizedBlock getInstance() {
		if (instance == null) {
			// 缩小同步控制范围，避免无畏的效率牺牲
			synchronized (LazySynchronizedBlock.class) {
				instance = new LazySynchronizedBlock();
			}
		}
		return instance;
	}
}
