package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**代理对象工厂，利用反射技术生成为聚合的目标对象创建代理对象
 * @author Van
 */
public class ProxyFactory {
	private Object teacherDao;

	public ProxyFactory(Object teacherDao) {
		this.teacherDao = teacherDao;
	}

	public Object getProxyInstance() {
		/*
		 * public static Object newProxyInstance(
		 *     ClassLoader loader,    当前目标对象使用的类加载器
		 *     Class<?>[]interfaces,  目标对象实现的接口类型，使用泛型确认类型
		 *     InvocationHandler h    执行目标对象的方法时，会触发事件处理器
		 * )
		 */ 
		return Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(),
				new InvocationHandler() { 

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK代理开始");
						//利用反射机制调用目标对象的方法
						Object returnValue = method.invoke(teacherDao, args);
						System.out.println("JDK代理提交");
						return returnValue;
					}
				});
	}
}
