package proxy.dynamicProxy;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testDynamicProxy() {
		// 目标对象
		ITeacherDao teacherDao = new TeacherDaoImpl();
		// 将目标对象送进代理工厂，生成ITeacherDao的代理对象
		ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
		ITeacherDao teacherDaoProxy = (ITeacherDao) proxyFactory.getProxyInstance();
		// teacherDaoProxy = class com.sun.proxy.$Proxy8。$符号表示该对象是代理对象
		System.out.println("teacherDaoProxy = " + teacherDaoProxy.getClass());
		teacherDaoProxy.teach();
	}

}
