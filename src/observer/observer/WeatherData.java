package observer.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 被观察者接口的实现类-天气数据类
 * 
 * @author Van
 */
public class WeatherData implements ISubject {

	// 温度、气压、湿度
	private float temperature;
	private float pressure;
	private float humidity;
	// 观察者注册表
	List<IObserver> observers = new LinkedList<IObserver>();

	@Override
	public void updateInnerData(float temperature, float pressure, float humidity) {
		// 自更新
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		// 同步更新
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// 遍历观察者列表，逐个更新数据
		for (IObserver observer : observers)
			observer.update(this.temperature, this.pressure, this.humidity);
	}

}
