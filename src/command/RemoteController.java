package command;

/**
 * 遥控器类
 * 
 * @author Van
 */
public class RemoteController {
	private IHouseholdCommand command;

	public RemoteController(IHouseholdCommand command) {
		this.command = command;
	}

	/**
	 * 按下“开”键
	 */
	public void pushOnKey() {
		command.turnOn();
	}

	/**
	 * 按下“关”键
	 */
	public void pushOffKey() {
		command.turnOff();
	}
}
