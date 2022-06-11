package adapter.objectAdapter;

/**
 * 适配器
 * 
 * @author Van
 */
public class VoltageAdapter implements Voltage5V {

	/**
	 * 通过参数依赖持有被适配者实例
	 * 
	 * @param voltage220V
	 * @return
	 */
	@Override
	public int output(Voltage220V voltage220V) {
		// 原始电压
		int srcVoltage = voltage220V.output();
		// 转换为目标电压
		int targetVoltage = srcVoltage / 44;
		return targetVoltage;
	}

}
