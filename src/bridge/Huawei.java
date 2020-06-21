package bridge;

/**
 * 华为手机
 * 
 * @author Van
 */
public class Huawei implements IPhoneBrand {

	@Override
	public void open() {
		System.out.println("华为手机开机");
	}

	@Override
	public void close() {
		System.out.println("华为手机关机");
	}

	@Override
	public void call() {
		System.out.println("华为手机通话");
	}

}
