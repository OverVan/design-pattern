package proxy.cglib;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testCglibProxy() {
		// 创建目标对象
		TeacherDao teacherDao = new TeacherDao();
		// 获取目标对象的代理对象
		TeacherDao teacherDaoProxy = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
		// 调用代理对象的方法，一经执行就会触发intercept方法的执行
		teacherDaoProxy.teach();
	}

}
