package bridge;

/**
 * 手机品牌接口
 * 
 * @author Van
 */
public interface IPhoneBrand {
	/**
	 * 开机
	 */
	void open();

	/**
	 * 关机
	 */
	void close();

	/**
	 * 打电话
	 */
	void call();
}
