package bridge.bridge;

/**
 * 滑屏式手机
 * 
 * @author Van
 */
public class Slide extends PhoneStyle {

	public Slide(PhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		System.out.println("滑动屏幕解锁");
		phoneBrand.open();
	}

	@Override
	public void close() {
		System.out.println("滑动屏幕解闷");
		phoneBrand.close();
	}

}
