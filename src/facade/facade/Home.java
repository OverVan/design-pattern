package facade.facade;

import org.junit.jupiter.api.Test;

class Home {

	@Test
	void testWatchMovie() {
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.watchMovie("太极张三丰");
	}

	@Test
	void testEndMovie() {
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.endMovie();
	}

}
