package bridge.original;

import org.junit.jupiter.api.Test;

class Customer {

	@Test
	void testHuaweiFolder() {
		Phone huaweiFolder = new HuaweiFolder();
		huaweiFolder.open();
		huaweiFolder.close();
	}

	@Test
	void testVivoUpright() {
		Phone vivoUpright = new VivoUpright();
		vivoUpright.open();
		vivoUpright.close();
	}

}
