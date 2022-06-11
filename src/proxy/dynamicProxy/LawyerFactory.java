package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂，可以为任意类型的被代理对象生成代理对象
 * 
 * @author Van
 */
public class LawyerFactory {
	/**
	 * @param target 用Object类型适配各类目标对象
	 * @return 目标对象的代理对象 Object准备强转为目标类实现的接口
	 */
	public static Object getLawyer(Object target) {
		// 利用反射为目标对象生成代理对象 传入目标对象的类加载器、实现的接口及事件处理器的匿名实现类的匿名对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 前置逻辑
						System.out.println(args[0] + "律师开展开庭前的工作");
						// 利用反射动态调用目标对象的方法，invoke的返回值就是此方法的返回值
						Object returnValue = method.invoke(target, args);
						// 后置逻辑
						System.out.println(args[0] + "律师开展胜诉后的工作");
						return returnValue;
					}
				});
		// 代理对象的结构复刻第三个参数对象的结构，但两对象毕竟分属不同类
	}
}
