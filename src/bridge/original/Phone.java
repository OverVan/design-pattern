package bridge.original;

/**
 * 抽象的手机类
 * 
 * @author Van
 *
 */
public abstract class Phone {
	public void open() {
		System.out.println("开机");
	}

	public void close() {
		System.out.println("关机");
	}
}
