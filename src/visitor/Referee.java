package visitor;

/**
 * 评委类
 * 
 * @author Van
 */
public abstract class Referee {
	/**
	 * 接收访问者Assess
	 * 
	 * @param assess 评判对象
	 */
	public abstract void accept(Assess assess);
}
