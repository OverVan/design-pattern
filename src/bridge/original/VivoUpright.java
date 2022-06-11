package bridge.original;

public class VivoUpright extends Upright {
	@Override
	public void open() {
		super.open();
		System.out.println("Vivo欢迎界面");
	}

	@Override
	public void close() {
		super.close();
		System.out.println("Vivo退出界面");
	}
}
