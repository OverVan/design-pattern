package command;

/**
 * 对点灯的命令
 * 
 * @author Van
 */
public class LightCommand implements IHouseholdCommand {
	private Light light;

	/**
	 * 开电灯
	 */
	public void turnOn() {
		light.turnOn();
	}

	/**
	 * 关电灯
	 */
	public void turnOff() {
		light.turnOff();
	}
}
