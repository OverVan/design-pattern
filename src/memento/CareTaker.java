package memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 备忘录的结构与操作类
 * 
 * @author Van
 */
public class CareTaker {
	// 备忘录映射
	private Map<String, ArrayList<Memento>> mementoMap;

	/**
	 * 针对每个角色名创建一个备忘录列表
	 * 
	 * @param names 角色名列表
	 */
	public CareTaker(List<String> names) {
		mementoMap = new HashMap<String, ArrayList<Memento>>();
		for (String name : names) {
			mementoMap.put(name, new ArrayList<Memento>());
		}
	}

	/**
	 * 向某角色的备忘录列表中添加新备忘录
	 * 
	 * @param name    角色名
	 * @param memento 备忘录对象
	 */
	public void addMemento(String name, Memento memento) {
		List<Memento> mementos = mementoMap.get(name);
		mementos.add(memento);
	}

	/**
	 * 得到某角色某一时刻的备忘录
	 * 
	 * @param name  角色名
	 * @param index 备忘录号
	 * @return
	 */
	public Memento getMemento(String name, int index) {
		return mementoMap.get(name).get(index);
	}
}
