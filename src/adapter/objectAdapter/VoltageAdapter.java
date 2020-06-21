package adapter.objectAdapter;

/**
 * 适配器，src的子类兼dst的实现类
 * 
 * @author Van
 */
public class VoltageAdapter implements IVoltage5V {

	@Override
	public int output5V(Voltage220V voltage220V) {
		// 原始电压
		int srcVoltage = voltage220V.output220V();
		// 转换为目标电压
		int dstVoltage = srcVoltage / 44;
		return dstVoltage;
	}

}
