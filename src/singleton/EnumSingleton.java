package singleton;

public enum EnumSingleton {
	INSTANCE("枚举单例");
	private final String MSG;

	public String getMSG() {
		return MSG;
	}

	private EnumSingleton(String msg) {
		this.MSG = msg;
	}
}
