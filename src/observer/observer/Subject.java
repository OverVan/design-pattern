package observer.observer;

/**
 * 发布者接口、主题接口
 * 
 * @author Van
 */
public interface Subject {
	/**
	 * 注册新的观察者
	 * 
	 * @param observer
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除现有的观察者
	 * 
	 * @param observer
	 */
	void removeObserver(Observer observer);

	/**
	 * 知会观察者更新数据
	 */
	void notifyObservers();
}
