package bridge;

/**
 * 滑屏式手机
 * 
 * @author Van
 */
public class SlidePhone extends PhoneStyle {

	public SlidePhone(IPhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		System.out.println("当前是滑屏手机");
		phoneBrand.open();
	}

	@Override
	public void close() {
		System.out.println("当前是滑屏手机");
		phoneBrand.close();
	}

	@Override
	public void call() {
		System.out.println("当前是滑屏手机");
		phoneBrand.call();
	}

}
