package adapter.classAdapter;

/**
 * 适配器，src的子类兼dst的实现类
 * 
 * @author Van
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// 原始电压
		int srcVoltage = output220V();
		// 转换为目标电压
		int dstVoltage = srcVoltage / 44;
		return dstVoltage;
	}

}
