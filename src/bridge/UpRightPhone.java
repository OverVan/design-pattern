package bridge;

/**
 * 直立按键式手机
 * 
 * @author Van
 */
public class UpRightPhone extends PhoneStyle {

	public UpRightPhone(IPhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		System.out.println("当前是直立按键手机");
		phoneBrand.open();
	}

	@Override
	public void close() {
		System.out.println("当前是直立按键手机");
		phoneBrand.close();
	}

	@Override
	public void call() {
		System.out.println("当前是直立按键手机");
		phoneBrand.call();
	}

}
