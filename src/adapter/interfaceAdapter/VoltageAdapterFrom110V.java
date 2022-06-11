package adapter.interfaceAdapter;

/**
 * 具体适配器
 * 
 * @author Van
 *
 */
public class VoltageAdapterFrom110V extends DefaultVoltageAdapter {
	// 通过聚合持有被适配者实例
	private Voltage110V voltage110V;

	public VoltageAdapterFrom110V(Voltage110V voltage110v) {
		super();
		voltage110V = voltage110v;
	}

	@Override
	public int output10V() {
		// 象征性地转换一下
		return voltage110V.output() / 11;
	}
}
