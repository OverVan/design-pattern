package adapter.interfaceAdapter;

public class Phone {
	/**
	 * 用适配者输出的5V充电
	 * 
	 * @param targetVoltage
	 */
	public void chargeWith5V(TargetVoltage targetVoltage) {
		System.out.println("手机正在充电，电压：" + targetVoltage.output5V() + "V");
	}

	/**
	 * 用适配者输出的10V充电
	 * 
	 * @param targetVoltage
	 */
	public void chargeWith10V(TargetVoltage targetVoltage) {
		System.out.println("手机正在充电，电压：" + targetVoltage.output10V() + "V");
	}
}
