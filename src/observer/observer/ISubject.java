package observer.observer;

/**
 * 被观察者接口
 * 
 * @author Van
 */
public interface ISubject {
	/**
	 * 注册一个新的观察者
	 * 
	 * @param observer
	 */
	void registerObserver(IObserver observer);

	/**
	 * 移除一个现有的观察者
	 * 
	 * @param observer
	 */
	void removeObserver(IObserver observer);

	/**
	 * 自更新数据，并知会所有观察者同步更新
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 * 
	 */
	public void updateInnerData(float temperature, float pressure, float humidity);

	/**
	 * 知会观察者更新数据
	 */
	void notifyObservers();
}
