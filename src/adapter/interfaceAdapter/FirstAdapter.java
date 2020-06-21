package adapter.interfaceAdapter;

public class FirstAdapter extends DefaultVoltage {
	@Override
	public int output5V() {
		return 5;
	}

	@Override
	public int output10V() {
		return 10;
	}
}
