package bridge;

/**
 * 小米手机
 * 
 * @author Van
 */
public class Mi implements IPhoneBrand {

	@Override
	public void open() {
		System.out.println("小米手机开机");
	}

	@Override
	public void close() {
		System.out.println("小米手机关机");
	}

	@Override
	public void call() {
		System.out.println("小米手机通话");
	}

}
