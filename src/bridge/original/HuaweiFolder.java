package bridge.original;

public class HuaweiFolder extends Folder {
	@Override
	public void open() {
		super.open();
		System.out.println("华为欢迎界面");
	}

	@Override
	public void close() {
		System.out.println("华为退出界面");
		super.close();
	}
}
