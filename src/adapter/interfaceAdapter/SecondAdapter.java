package adapter.interfaceAdapter;

public class SecondAdapter extends DefaultVoltage {
	@Override
	public int output15V() {
		return 15;
	}

	@Override
	public int output20V() {
		return 20;
	}
}
