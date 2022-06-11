package adapter.classAdapter;

/**
 * 适配器
 * 
 * @author Van
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int output5V() {
		// 调用被适配者的方法，获取原始电压
		int srcVoltage = output220V();
		// 转换为目标电压，这里就把象征性的除法当转换了
		int targetVoltage = srcVoltage / 44;
		return targetVoltage;
	}

}
