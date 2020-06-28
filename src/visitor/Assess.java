package visitor;

/**
 * 评判类
 * 
 * @author Van
 */
public abstract class Assess {
	/**
	 * 返回男评委的评判
	 */
	public abstract void getManAssess(ManReferee manReferee);

	/**
	 * 返回女评委的评判
	 */
	public abstract void getWomanAssess(WomanReferee womanReferee);
}
