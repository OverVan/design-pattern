package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 代理对象工厂，生产代理对象
 * 
 * @author Van
 */
public class ProxyFactory implements MethodInterceptor {

	// 目标对象
	private Object teacherDao;

	public ProxyFactory(Object teacherDao) {
		this.teacherDao = teacherDao;
	}

	/**
	 * 重写接口里的方法，调用目标对象的方法
	 */
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("Cglib代理模式开启");
		Object returnValue = method.invoke(teacherDao, args);
		System.out.println("Cglib代理模式提交");
		return returnValue;
	}

	/**
	 * 返回目标对象的代理对象
	 * 
	 * @return
	 */
	public Object getProxyInstance() {
		// 创建工具栏
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(teacherDao.getClass());
		// 设置回调函数
		enhancer.setCallback(this);
		// 创建子类对象即代理对象
		return enhancer.create();
	}

}
