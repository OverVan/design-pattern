package proxy.dynamicProxy;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void testDynamicProxy() {
		// 目标对象
		Professor professor = new Professor();
		Wife wife = new Wife();
		// 将目标对象送进代理工厂
		LawyerFactory maintainProxyFactory = new LawyerFactory(professor);
		LawyerFactory divorceProxyFactory = new LawyerFactory(wife);
		// 再由代理工厂生成它们对应的代理对象
		Maintainable maintainLawyer = (Maintainable) maintainProxyFactory.getLawyer();
		Divorcing divorceLawyer = (Divorcing) divorceProxyFactory.getLawyer();
		// teacherDaoProxy = class com.sun.proxy.$Proxy9 $符号表示该对象是代理对象
		System.out.println("teacherDaoProxy = " + divorceLawyer.getClass());
		// 用同一个代理类的不同代理对象调相应接口的方法，但扩展相同的功能
		maintainLawyer.maintain("维权", 1024);
		divorceLawyer.divorce("离婚", "离婚万岁，结婚受罪");
	}

}
