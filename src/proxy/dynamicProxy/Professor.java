package proxy.dynamicProxy;

/**
 * 目标类 教授
 * 
 * @author Van
 */
public class Professor implements Maintainable {

	@Override
	public void maintain(String work, int code) {
		System.out.println(code + "教授做维权的工作");
	}

}
