package bridge.original;

public class Folder extends Phone {
	@Override
	public void open() {
		System.out.println("打开盖子");
		super.open();
	}

	@Override
	public void close() {
		super.close();
		System.out.println("关上盖子");
	}
}
