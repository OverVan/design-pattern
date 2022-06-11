package adapter.interfaceAdapter;

import org.junit.jupiter.api.Test;

class InterfaceAdapterTest {

	@Test
	void testChargeWith5V() {
		Phone phone = new Phone();
		// 110V转换到5V
		phone.chargeWith5V(new VoltageAdapterFrom110V(new Voltage110V()));
		// 220V转换到5V
		phone.chargeWith5V(new VoltageAdapterFrom220V(new Voltage220V()));

	}

	@Test
	void testChargeWith10V() {
		Phone phone = new Phone();
		// 110V转换到10V
		phone.chargeWith10V(new VoltageAdapterFrom110V(new Voltage110V()));
		// 220V转换到10V
		phone.chargeWith10V(new VoltageAdapterFrom220V(new Voltage220V()));
	}

}
