package bridge.original;

public class VivoFolder extends Folder {
	@Override
	public void open() {
		super.open();
		System.out.println("Vivo欢迎界面");
	}

	@Override
	public void close() {
		System.out.println("Vivo退出界面");
		super.close();
	}
}
