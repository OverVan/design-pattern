package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂
 * 
 * @author Van
 */
public class LawyerFactory {
	// 用Ojbect接收各种目标对象
	private Object target;

	public LawyerFactory(Object target) {
		this.target = target;
	}

	public Object getLawyer() {
		// 利用反射根据目标对象生成代理对象 传入目标对象的类加载器、实现的接口及事件处理器接口的匿名实现类的匿名对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println(args[0] + "律师开展开庭前的工作");
						// 利用反射动态调用目标对象的某个方法，invoke的返回值就是此方法的返回值
						Object returnValue = method.invoke(target, args);
						System.out.println(args[0] + "律师开展胜诉后的工作");
						return returnValue;
					}
				});
	}
}
