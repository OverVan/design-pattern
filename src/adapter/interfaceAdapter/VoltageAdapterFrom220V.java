package adapter.interfaceAdapter;

/**
 * 具体适配器
 * 
 * @author Van
 *
 */
public class VoltageAdapterFrom220V extends DefaultVoltageAdapter {
	private Voltage220V voltage220V;

	public VoltageAdapterFrom220V(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		return voltage220V.output() / 44;
	}

}
