package bridge.bridge;

/**
 * 翻盖式手机
 */
public class Folder extends PhoneStyle {

	public Folder(PhoneBrand phoneBrand) {
		super(phoneBrand);
	}

	@Override
	public void open() {
		phoneBrand.open();
		System.out.println("打开盖子");
	}

	@Override
	public void close() {
		phoneBrand.close();
		System.out.println("关上盖子");
	}

}
