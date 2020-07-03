package observer.observer;

/**
 * 观察者接口
 * 
 * @author Van
 */
public interface IObserver {
	/**
	 * 更新数据
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	void update(float temperature, float pressure, float humidity);

	/**
	 * 显示天气状况
	 */
	public void display();
}
