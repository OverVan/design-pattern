package visitor;

/**
 * 淘汰类，继承评判类
 * 
 * @author Van
 */
public class Fail extends Assess {

	@Override
	public void getManAssess(ManReferee manReferee) {
		System.out.println("男评委：淘汰");
	}

	@Override
	public void getWomanAssess(WomanReferee womanReferee) {
		System.out.println("女评委：淘汰");
	}

}
