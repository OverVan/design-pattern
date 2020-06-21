package adapter.objectAdapter;

/**
 * 手机类，要充电的
 * 
 * @author Van
 */
public class Phone {
	/**
	 * 充电
	 * 
	 * @param voltage5V 适配者
	 */
	public void charging(IVoltage5V voltage5V) {
		System.out.println("手机正在充电，电压：" + voltage5V.output5V(new Voltage220V()) + "V");
	}
}
