package proxy.cglib;

/**
 * 目标类 教授 不实现任何接口
 * 
 * @author Van
 */
public class Professor {

	public void maintain(String work, int code) {
		System.out.println(code + "教授做维权的工作");
	}

}
