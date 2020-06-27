package command;

/**
 * 对冰箱的命令
 * 
 * @author Van
 */
public class RefrigeratorCommand implements IHouseholdCommand {
	private Refrigerator refrigerator;

	/**
	 * 开冰箱
	 */
	public void turnOn() {
		refrigerator.turnOn();
	}

	/**
	 * 关冰箱
	 */
	public void turnOff() {
		refrigerator.turnOff();
	}
}
