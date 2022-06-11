package observer.observer;

/**
 * 观察者接口
 * 
 * @author Van
 */
public interface Observer {
	/**
	 * 更新数据
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	void update(float temperature, float pressure, float humidity);

	/**
	 * 展示数据
	 */
	public void display();
}
