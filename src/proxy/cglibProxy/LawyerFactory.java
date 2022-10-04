package proxy.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 代理对象工厂，为任何目标类的对象生成代理对象，且无需实现同一接口
 * 
 * @author Van
 */
public class LawyerFactory implements MethodInterceptor {

	// 目标对象
	private Object target;

	public LawyerFactory(Object target) {
		this.target = target;
	}

	/**
	 * 重写MethodInterceptor接口的方法，调用目标对象的目标方法并扩展逻辑
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
	 * 返回目标对象的代理对象
	 * 
	 * @return
	 */
	public Object getProxyInstance() {
		// 创建工具栏
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(target.getClass());
		// 设置回调函数
		enhancer.setCallback(this);
		// 创建子类对象即代理对象
		return enhancer.create();
	}

}
