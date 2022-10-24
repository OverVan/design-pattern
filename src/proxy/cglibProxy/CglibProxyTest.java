package proxy.cglibProxy;

import org.junit.jupiter.api.Test;

class CglibProxyTest {

	@Test
	void testCglibProxy() {
		// 创建目标对象
		Wife wife = new Wife();
		// 获取目标对象的代理对象
		Wife wifeProxy = (Wife) new LawyerFactory(wife).getProxyInstance();
		// 调用代理对象的方法，触发intercept回调
		wifeProxy.divorce("离婚", "离婚万岁，结婚受罪");

		Professor professor = new Professor();
		Professor professorProxy = (Professor) new LawyerFactory(professor).getProxyInstance();
		professorProxy.maintain("维权", 1024);
		// class proxy.cglib.Professor$$EnhancerByCGLIB$$7a7b5fa
		System.out.println(professorProxy.getClass());
	}

}
