package bridge.bridge;

/**
 * 实现层-手机品牌接口 从右往左延伸桥接，那么最右边的一层就不被桥接，就没有属性，故适合表示成接口
 * 
 * @author Van
 */
public interface PhoneBrand {
	/**
	 * 开机
	 */
	void open();

	/**
	 * 关机
	 */
	void close();
}
