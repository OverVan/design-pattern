package bridge.bridge;

/**
 * 小米手机
 * 
 * @author Van
 */
public class Mi implements PhoneBrand {

	@Override
	public void open() {
		System.out.println("小米开机");
	}

	@Override
	public void close() {
		System.out.println("小米关机");
	}

}
