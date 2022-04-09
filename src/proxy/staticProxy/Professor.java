package proxy.staticProxy;

/**
 * 目标类 教授因知识产权而起诉
 * 
 * @author Van
 */
public class Professor implements Actionable {

	@Override
	public void litigate() {
		System.out.println("教授的起诉工作");
	}

}
