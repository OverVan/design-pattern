package proxy.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 代理对象工厂，为任何目标类的对象生成代理对象，且代理类目标类均不用实现接口
 */
public class LawyerFactory implements MethodInterceptor {

	// 目标对象
	private Object target;

	public LawyerFactory(Object target) {
		this.target = target;
	}

	/**
	 * 重写MethodInterceptor接口的方法，调用目标对象的目标方法并扩展逻辑
	 * 由于代理类是目标类的子类，自然就继承并能覆盖目标方法，那么代理对象调用目标方法，底层就执行本类对象的intercept回调
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// 前置逻辑
		System.out.println("Cglib代理模式开启，" + args[0] + "律师开展开庭前的工作");
		Object returnValue = method.invoke(target, args);
		// 后置逻辑
		System.out.println("Cglib代理模式提交，" + args[0] + "律师开展胜诉后的工作");
		return returnValue;
	}

	/**
	 * 获取目标对象的代理对象
	 * 
	 * @return
	 */
	public Object getProxyInstance() {
		// 创建增强器
		Enhancer enhancer = new Enhancer();
		// 设置被代理类为父类
		enhancer.setSuperclass(target.getClass());
		// 传入本类对象，间接设置intercept回调
		enhancer.setCallback(this);
		// 创建子类对象即代理对象
		return enhancer.create();
	}

}
