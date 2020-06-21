package builder.primitive;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * 客户端测试
 * 
 * @author Van
 */
class Client {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testBuildCabin() {
		new BuildCabin().build();
	}

	@Test
	void testBuildApartment() {
		new BuildApartment().build();
	}
}
