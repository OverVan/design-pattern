package bridge.bridge;

/**
 * 华为手机
 * 
 * @author Van
 */
public class Huawei implements PhoneBrand {

	@Override
	public void open() {
		System.out.println("华为开机");
	}

	@Override
	public void close() {
		System.out.println("华为关机");
	}

}
