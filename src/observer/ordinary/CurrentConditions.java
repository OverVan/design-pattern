package observer.ordinary;

/**
 * 第三方平台类
 * 
 * @author Van
 */
public class CurrentConditions {
	// 温度、气压、湿度
	private float temperature;
	private float pressure;
	private float humidity;

	/**
	 * 更新天气数据并展示
	 * 
	 * @param temperature 温度
	 * @param pressure    气压
	 * @param humidity    湿度
	 */
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	/**
	 * 显示天气状况
	 */
	public void display() {
		System.out.println("the temperature now is: " + temperature);
		System.out.println("the pressure now is: " + pressure);
		System.out.println("the humidity now is: " + humidity);
	}
}
