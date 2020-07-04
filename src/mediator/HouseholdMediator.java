package mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者实现类-家电中介者类
 * 
 * @author Van
 */
public class HouseholdMediator extends Mediator {

	// 管理的家电对象映射
	private Map<String, Household> households;

	public HouseholdMediator() {
		households = new HashMap<String, Household>();
	}

	/**
	 * 核心方法：根据消息码和家电名取家电对象，进而控制该家电的下一步行为
	 */
	@Override
	public void getMessage(int state, String name) {
		if (households.containsKey(name)) {
			Household household = households.get(name);
			if (state == 1)
				household.start();
			else if (state == 0)
				household.stop();
		}
	}

	/**
	 * 注册家电，即将家电加入家电映射
	 */
	@Override
	public void registerHousehold(String name, Household household) {
		if (!households.containsKey(name))
			households.put(name, household);
	}

	@Override
	public void sendMessage(int state) {
		// TODO Auto-generated method stub

	}

}
