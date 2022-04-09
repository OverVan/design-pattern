package proxy.dynamicProxy;

/**
 * 目标类 妻子
 * 
 * @author Van
 *
 */
public class Wife implements Divorcing {

	@Override
	public void divorce(String work, String slogan) {
		System.out.println("妻子做离婚的工作" + slogan);
	}

}
