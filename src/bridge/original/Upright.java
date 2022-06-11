package bridge.original;

public class Upright extends Phone {
	@Override
	public void open() {
		System.out.println("直屏长按电源键");
		super.open();
	}

	@Override
	public void close() {
		System.out.println("直屏长按电源键");
		super.close();
	}
}
