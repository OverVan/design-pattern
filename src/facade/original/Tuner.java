package facade.original;

/**
 * 电台
 */
public class Tuner {
	private Amplifier amplifier;

	public void on() {
		System.out.println("tuner on");
	}

	public void off() {
		System.out.println("tuner off");
	}

	public void setAm() {
		System.out.println("tuner setting AM");
	}

	public void setFm() {
		System.out.println("tuner setting FM");
	}

	public void setFrequency() {
		System.out.println("tuner setting frequecncy");
	}

	@Override
	public String toString() {
		// 也不晓得依赖它干啥，姑且打出来
		return "Tuner [amplifier=" + amplifier + "]";
	}
}
