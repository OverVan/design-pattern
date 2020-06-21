package bridge;

/**
 * Vivo手机
 * 
 * @author Van
 */
public class Vivo implements IPhoneBrand {

	@Override
	public void open() {
		System.out.println("Vivo手机开机");
	}

	@Override
	public void close() {
		System.out.println("Vivo手机关机");
	}

	@Override
	public void call() {
		System.out.println("Vivo手机通话");
	}

}
