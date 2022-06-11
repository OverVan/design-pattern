package adapter.classAdapter;

public class Phone {
	/**
	 * 充电
	 * 
	 * @param voltage5V 适配者
	 */
	public void charge(Voltage5V voltage5V) {
		System.out.println("手机正在充电，电压：" + voltage5V.output5V() + "V");
	}
}
