package observer.observer;

/**
 * 具体的观察者类
 * 
 * @author Van
 *
 */
public class SinaWeather implements Observer {

	// 从发布者处获取数据
	private float temperature;
	private float pressure;
	private float humidity;

	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;

	}

	@Override
	public void display() {
		System.out.println("======新浪天气======");
		System.out.println("the temperature now is: " + temperature);
		System.out.println("the pressure now is: " + pressure);
		System.out.println("the humidity now is: " + humidity);
	}

}
