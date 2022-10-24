package facade.facade;

/**
 * 灯光
 */
public class TheaterLights {
	public void on() {
		System.out.println("theater lights on");
	}

	public void off() {
		System.out.println("theater lights off");
	}

	public void dim(int brightness) {
		System.out.printf("theater lights dimming to %d%% \n", brightness);
	}
}
