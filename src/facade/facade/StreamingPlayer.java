package facade.facade;

/**
 * 播放器
 */
public class StreamingPlayer {
	private Amplifier amplifier;

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println("streaming player on");
	}

	public void off() {
		System.out.println("streaming player off");
	}

	public void pause() {
		System.out.println("streaming player paused");
	}

	public void play(String movie) {
		System.out.println("streaming player playing \"" + movie + "\"");
	}

	public void setSurroundAudio() {
		amplifier.setSurroundSound();
	}

	public void setTwoChannelAudio() {
		amplifier.setStereoSound();
	}

	public void stop() {
		System.out.println("streaming player stopped");
	}
}
