package proxy.staticProxy;

/**
 * 目标类 妻子因离婚而起诉
 * 
 * @author Van
 *
 */
public class Wife implements Actionable {

	@Override
	public void litigate() {
		System.out.println("妻子的起诉工作");
	}

}
