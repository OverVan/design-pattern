package bridge.bridge;

/**
 * 抽象层-手机样式
 */
public abstract class PhoneStyle {
	// 聚合实现层次-品牌接口
	protected PhoneBrand phoneBrand;

	/**
	 * 
	 * @param phoneBrand IPhoneBrand对象
	 */
	public PhoneStyle(PhoneBrand phoneBrand) {
		super();
		this.phoneBrand = phoneBrand;
	}

	/**
	 * 开机
	 */
	public abstract void open();

	/**
	 * 关机
	 */
	public abstract void close();

}
