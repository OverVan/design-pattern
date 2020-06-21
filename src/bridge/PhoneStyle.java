package bridge;

/**
 * 手机（以各种样式为子类）
 * 
 * @author Van
 */
public abstract class PhoneStyle {
	protected IPhoneBrand phoneBrand;

	/**
	 * 有参构造器
	 * 
	 * @param phoneBrand IPhoneBrand的实现类
	 */
	public PhoneStyle(IPhoneBrand phoneBrand) {
		super();
		this.phoneBrand = phoneBrand;
	}

	/**
	 * 开机
	 */
	protected abstract void open();

	/**
	 * 关机
	 */
	protected abstract void close();

	/**
	 * 打电话
	 */
	protected abstract void call();
}
