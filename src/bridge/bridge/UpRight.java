package bridge.bridge;

/**
 * 直立式手机
 * 
 * @author Van
 */
public class UpRight extends PhoneStyle {

	public UpRight(PhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		System.out.println("直立长按电源键");
		phoneBrand.open();
	}

	@Override
	public void close() {
		System.out.println("直立长按电源键");
		phoneBrand.close();
	}

}
