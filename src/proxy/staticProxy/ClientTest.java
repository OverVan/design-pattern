package proxy.staticProxy;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
public class ClientTest {
	@Test
	void testStaticProxy() {
		ITeacherDao teacherDaoProxy = new TeacherDaoProxy(new TeacherDaoImpl());
		teacherDaoProxy.teach();
	}
}
