package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂，可以为任意类型的被代理对象生成代理对象
 */
public class LawyerFactory {
	/**
	 * @param target 用Object类型适配各类目标对象，准备强转为目标类实现的接口
	 * @return 目标对象的代理对象
	 */
	public static Object getLawyer(Object target) {
		// 利用反射为目标对象生成代理对象，传入目标对象的类加载器、实现的接口及事件处理器的匿名实现类的匿名对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					/**
					 * 参数：代理对象；目标方法对象；目标方法的实参列表
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 前置逻辑
						System.out.println(args[0] + "律师开展开庭前的工作");
						// 利用反射动态调用目标方法，其返回值作invoke的返回值
						Object returnValue = method.invoke(target, args);
						// 后置逻辑
						System.out.println(args[0] + "律师开展胜诉后的工作");
						return returnValue;
					}
				});
		// 代理类隐式地实现目标类实现的接口，含引用上述匿名对象的protected属性h，那么实现接口下的所有方法，底层就调用h的invoke方法
	}
}
