package observer.ordinary;

/**
 * 气象站类-数据发布方
 * 
 * @author Van
 */
public class WeatherData {
	// 温度、气压、湿度
	private float temperature;
	private float pressure;
	private float humidity;
	// 第三方平台对象 面向具体实现编程，高耦合，违反OCP，增加第三方平台类，会影响这个文件
	private BaiduWeather baiduWeather;
	private SinaWeather sinaWeather;

	public WeatherData(BaiduWeather baiduWeather, SinaWeather sinaWeather) {
		this.baiduWeather = baiduWeather;
		this.sinaWeather = sinaWeather;
	}

	/**
	 * 测量并更新天气数据
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void setMeasurements(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	/**
	 * 天气数据已更新，通知第三方平台更新
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void measuermentsChanged() {
		baiduWeather.update(temperature, pressure, humidity);
		sinaWeather.update(temperature, pressure, humidity);
	}
}
