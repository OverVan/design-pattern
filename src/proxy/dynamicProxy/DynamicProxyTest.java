package proxy.dynamicProxy;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DynamicProxyTest {

	@Test
	void testDynamicProxy() {
		// 目标对象
		Professor professor = new Professor();
		Wife wife = new Wife();
		// 将目标对象送进代理工厂，再由代理工厂生成对应的代理对象
		Maintainable maintainLawyer = (Maintainable) LawyerFactory.getLawyer(professor);
		Divorcing divorceLawyer = (Divorcing) LawyerFactory.getLawyer(wife);
		// 不同代理对象调相应接口的方法，但扩展相同的功能
		maintainLawyer.maintain("维权", 1024);
		divorceLawyer.divorce("离婚", "离婚万岁，结婚受罪");
		// 代理类隐式实现接口，接口是代理类与被代理类的纽带
		System.out.println(Arrays.toString(maintainLawyer.getClass().getInterfaces()));
		// 结果说明此对象是代理对象而非原始Wife对象 class com.sun.proxy.$Proxy9
		System.out.println("divorceLawyer = " + divorceLawyer.getClass());
	}

}
