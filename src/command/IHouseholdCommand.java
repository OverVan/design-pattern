package command;

/**
 * 命令接口
 * 
 * @author Van
 */
public interface IHouseholdCommand {

	/**
	 * 开电器
	 */
	public void turnOn();

	/**
	 * 关电器
	 */
	public void turnOff();
}
