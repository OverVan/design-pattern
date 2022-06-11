package observer.ordinary;

/**
 * 第三方平台类-数据订阅方-百度天气
 * 
 * @author Van
 */
public class BaiduWeather {
	private float temperature;
	private float pressure;
	private float humidity;

	/**
	 * 根据发布方的动态及时更新数据
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	/**
	 * 展示天气数据
	 */
	public void display() {
		System.out.println("======百度天气======");
		System.out.println("the temperature now is: " + temperature);
		System.out.println("the pressure now is: " + pressure);
		System.out.println("the humidity now is: " + humidity);
	}
}
