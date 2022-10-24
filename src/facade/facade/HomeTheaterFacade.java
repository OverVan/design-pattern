package facade.facade;

import facade.original.Amplifier;
import facade.original.Projector;
import facade.original.Screen;
import facade.original.StreamingPlayer;
import facade.original.TheaterLights;

/**
 * 家庭影院外观
 */
public class HomeTheaterFacade {
	private TheaterLights lights;
	private Screen screen;
	private Projector projector;
	private Amplifier amplifier;
	private StreamingPlayer player;
	private Tuner tuner;

	private void prepareMovie() {
		lights = new TheaterLights();
		screen = new Screen();
		projector = new Projector();
		amplifier = new Amplifier();
		player = new StreamingPlayer();
	}

	private void prepareRaido() {
		tuner = new Tuner();
	}

	public void watchMovie(String movie) {
		prepareMovie();
		System.out.println("get ready to watch a movie");
		lights.dim(10);
		screen.down();
		projector.on();
		projector.setInput(player);
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setPlayer(player);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		player.on();
		player.play(movie);
	}

	public void endMovie() {
		prepareMovie();
		System.out.println("shutting movie theater down");
		lights.on();
		screen.up();
		projector.off();
		amplifier.off();
		player.stop();
		player.off();
	}

	public void listenToRadio() {
		prepareRaido();
		tuner.setAm();
	}

	public void endRadio() {
		prepareRaido();
	}
}
