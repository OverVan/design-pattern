package facade.facade;

/**
 * 投影仪
 */
public class Projector {
	private StreamingPlayer player;

	public void setInput(StreamingPlayer player) {
		this.player = player;
	}

	public void on() {
		System.out.println("projector on");
	}

	public void off() {
		System.out.println("projector off");
	}

	public void tvMode() {
		System.out.println("projector in tv mode (4\u00D73 ratio)");
	}

	public void wideScreenMode() {
		System.out.println("projector in wide screen mode (16\u00D79 ratio)");
	}

	@Override
	public String toString() {
		return "Projector [player=" + player + "]";
	}
}
