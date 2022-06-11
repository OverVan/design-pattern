package adapter.objectAdapter;

/**
 * 适配者
 * 
 * @author Van
 */
public interface Voltage5V {
	/**
	 * 返回5V电压
	 * 
	 * @param voltage220V
	 * @return
	 */
	int output(Voltage220V voltage220V);
}
