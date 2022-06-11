package adapter.classAdapter;

import org.junit.jupiter.api.Test;

class ClassAdapterTest {

	@Test
	void testCharge() {
		Phone phone = new Phone();
		phone.charge(new VoltageAdapter());
	}

}
