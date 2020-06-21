package adapter.objectAdapter;

/**
 * 适配者dst接口
 * 
 * @author Van
 */
public interface IVoltage5V {
	/**
	 * 返回5V的电压
	 * 
	 * @param voltage220V 聚合用的src类参数
	 * @return
	 */
	int output5V(Voltage220V voltage220V);
}
