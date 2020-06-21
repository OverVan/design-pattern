package adapter.objectAdapter;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCharging() {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
