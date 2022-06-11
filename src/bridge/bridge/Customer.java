package bridge.bridge;

import org.junit.jupiter.api.Test;

class Customer {

	@Test
	void testMiSlide() {
		Slide miSlide = new Slide(new Mi());
		miSlide.open();
		miSlide.close();
	}

	@Test
	void testVivoUpRight() {
		UpRight vivoUpRight = new UpRight(new Vivo());
		vivoUpRight.open();
		vivoUpRight.close();
	}

	@Test
	void testHuaweiFolder() {
		Folder huaFolder = new Folder(new Huawei());
		huaFolder.open();
		huaFolder.close();
	}

}
