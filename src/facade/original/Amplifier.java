package facade.original;

/**
 * 增大器
 */
public class Amplifier {
	// 接入电台
	private Tuner tuner;
	// 接入播放器
	private StreamingPlayer player;

	public void on() {
		System.out.println("amplifier on");
	}

	public void off() {
		System.out.println("amplifier off");
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
		System.out.println("amplifier setting tuner");
	}

	public void setPlayer(StreamingPlayer player) {
		this.player = player;
		System.out.println("amplifier setting streaming player");
	}

	public void setStereoSound() {
		System.out.println("amplifier stereo sound on");
	}

	public void setSurroundSound() {
		System.out.println("amplifier surround sound on");
	}

	public void setVolume(int volume) {
		System.out.println("amplifier setting volume to " + volume);
	}

	@Override
	public String toString() {
		// 也不晓得依赖它们干啥，姑且打出来
		return "Amplifier [tuner=" + tuner + ", player=" + player + "]";
	}
}
