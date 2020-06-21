package bridge;

/**
 * 翻盖手机
 * 
 * @author Van
 */
public class FolderPhone extends PhoneStyle {

	public FolderPhone(IPhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		System.out.println("当前是翻盖手机");
		phoneBrand.open();
	}

	@Override
	public void close() {
		System.out.println("当前是翻盖手机");
		phoneBrand.close();
	}

	@Override
	public void call() {
		System.out.println("当前是翻盖手机");
		phoneBrand.call();
	}

}
