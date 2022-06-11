package adapter.interfaceAdapter;

/**
 * 抽象适配器，对接口全体方法进行空实现
 * 
 * @author Van
 *
 */
public abstract class DefaultVoltageAdapter implements TargetVoltage {

	@Override
	public int output5V() {
		return 0;
	}

	@Override
	public int output10V() {
		return 0;
	}

}
