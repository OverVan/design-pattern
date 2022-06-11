package bridge.bridge;

/**
 * Vivo手机
 * 
 * @author Van
 */
public class Vivo implements PhoneBrand {

	@Override
	public void open() {
		System.out.println("Vivo开机");
	}

	@Override
	public void close() {
		System.out.println("Vivo关机");
	}

}
