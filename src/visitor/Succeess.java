package visitor;

/**
 * 晋级类，继承评判类
 * 
 * @author Van
 */
public class Succeess extends Assess {

	@Override
	public void getManAssess(ManReferee manReferee) {
		System.out.println("男评委：晋级");
	}

	@Override
	public void getWomanAssess(WomanReferee womanReferee) {
		System.out.println("女评委：晋级");
	}

}
