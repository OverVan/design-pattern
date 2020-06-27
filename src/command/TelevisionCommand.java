package command;

/**
 * 对电视机的命令
 * 
 * @author Van
 */
public class TelevisionCommand implements IHouseholdCommand {
	private Television television;

	/**
	 * 开电视
	 */
	public void turnOn() {
		television.turnOn();
	}

	/**
	 * 关电视
	 */
	public void turnOff() {
		television.turnOff();
	}
}
