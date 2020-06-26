package template;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testBlackBean() {
		SoymilkMakeTemplate blackBeanMake = new BlackBeanSoymilkMake();
		blackBeanMake.make();
	}

	@Test
	void testRedBean() {
		SoymilkMakeTemplate redBeanMake = new RedBeanSoymilkMak();
		redBeanMake.make();
	}

	@Test
	void testPeanut() {
		SoymilkMakeTemplate peanutMake = new PeanutSoymilkMake();
		peanutMake.make();
	}

	@Test
	void testPure() {
		SoymilkMakeTemplate pureSoymilkMake = new PureSoymilkMake();
		pureSoymilkMake.make();
	}

}
