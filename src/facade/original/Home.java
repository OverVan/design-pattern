package facade.original;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Home {
	private TheaterLights lights;
	private Screen screen;
	private Projector projector;
	private Amplifier amplifier;
	private StreamingPlayer player;

	@BeforeEach
	void prepare() {
		lights = new TheaterLights();
		screen = new Screen();
		projector = new Projector();
		amplifier = new Amplifier();
		player = new StreamingPlayer();
	}

	@Test
	void testWatchMovie() {
		System.out.println("get ready to watch a movie");
		// 调好灯光
		lights.dim(10);
		// 落下荧幕
		screen.down();
		// 调好投影仪
		projector.on();
		projector.setInput(player);
		projector.wideScreenMode();
		// 调好音响
		amplifier.on();
		amplifier.setPlayer(player);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		// 启动播放器
		player.on();
		player.play("Raiders of the Lost Ark");
	}

	@Test
	void testEndMovie() {
		System.out.println("shutting movie theater down");
		// 开灯
		lights.on();
		// 收起荧幕
		screen.up();
		// 关投影仪
		projector.off();
		// 关音响
		amplifier.off();
		// 停止播放
		player.stop();
		// 关播放器
		player.off();
	}

}
