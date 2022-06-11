package adapter.objectAdapter;

import org.junit.jupiter.api.Test;

class ObjectAdapterTest {

	@Test
	void testCharge() {
		Phone phone = new Phone();
		phone.charge(new VoltageAdapter());
	}

}
