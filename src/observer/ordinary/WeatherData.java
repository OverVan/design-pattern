package observer.ordinary;

/**
 * 天气数据类
 * 
 * @author Van
 */
public class WeatherData {
	// 温度、气压、湿度
	private float temperature;
	private float pressure;
	private float humidity;
	// 第三方对象
	private CurrentConditions currentConditions;

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	/**
	 * 温度接口
	 * 
	 * @return
	 */
	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	/**
	 * 气压接口
	 * 
	 * @return
	 */
	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	/**
	 * 湿度接口
	 * 
	 * @return
	 */
	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	/**
	 * 自更新数据，然后同步到第三方
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void updateInnerData(float temperature, float pressure, float humidity) {
		// 自更新
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		// 同步
		changeOuterData();
	}

	/**
	 * 同步更新第三方数据
	 */
	public void changeOuterData() {
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}
}
