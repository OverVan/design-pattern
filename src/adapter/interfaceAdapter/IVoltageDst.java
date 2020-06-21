package adapter.interfaceAdapter;

/**
 * 适配者dst接口
 * 
 * @author Van
 */
public interface IVoltageDst {
	/**
	 * 返回5V的电压
	 * 
	 * @param voltage220V 聚合用的src类参数
	 * @return
	 */
	int output5V();

	int output10V();

	int output15V();

	int output20V();
}
