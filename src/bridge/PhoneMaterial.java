package bridge;

/**
 * 按材质分类的手机抽象类
 * 
 * @author Van
 */
public abstract class PhoneMaterial {
	protected PhoneStyle phoneStyle;

	/**
	 * @param phoneStyle PhoneStyle的子类
	 */
	public PhoneMaterial(PhoneStyle phoneStyle) {
		super();
		this.phoneStyle = phoneStyle;
	}

	/**
	 * 玩游戏
	 */
	protected abstract void playGame();
}
