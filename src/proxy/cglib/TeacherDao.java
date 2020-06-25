package proxy.cglib;

/**
 * 目标对象
 * 
 * @author Van
 */
public class TeacherDao {
	public void teach() {
		System.out.println("老师授课中，使用Cglib代理，不需实现任何接口");
	}
}
