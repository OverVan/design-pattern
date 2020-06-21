package bridge;

public class GoldenPhone extends PhoneMaterial {

	public GoldenPhone(PhoneStyle phoneStyle) {
		super(phoneStyle);
	}

	@Override
	protected void playGame() {
		System.out.println("当前是土豪金手机");
		phoneStyle.open();
		System.out.println("开始玩儿游戏");
	}

}
