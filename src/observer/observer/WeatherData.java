package observer.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 主题接口的实现类-天气数据类
 * 
 * @author Van
 */
public class WeatherData implements Subject {
	// 温度、气压、湿度
	private float temperature;
	private float pressure;
	private float humidity;
	// 观察者注册表
	List<Observer> observers = new LinkedList<Observer>();

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

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// 遍历观察者，逐个通知更新
		for (Observer observer : observers) {
			observer.update(temperature, pressure, humidity);
		}
	}

	/**
	 * 气象站自己更新数据后触发
	 */
	public void measurementsChanged() {
		notifyObservers();
	}
}
