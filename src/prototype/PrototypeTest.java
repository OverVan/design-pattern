package prototype;

import org.junit.jupiter.api.Test;

class PrototypeTest {

	@Test
	void testTraditional() {
		Sheep dolly = new Sheep("Dolly", 1, "white");

//		// 傻写
//		Sheep dolly1 = new Sheep(dolly.getName(), dolly.getAge(), dolly.getColor());
//		Sheep dolly2 = new Sheep(dolly.getName(), dolly.getAge(), dolly.getColor());
//		Sheep dolly3 = new Sheep(dolly.getName(), dolly.getAge(), dolly.getColor());
//		// ……

		// 或用循环
		Sheep[] dollies = new Sheep[10];
		for (int i = 0; i < dollies.length; i++) {
			dollies[i].setName(dolly.getName());
			dollies[i].setAge(dolly.getAge());
			dollies[i].setColor(dolly.getColor());
		}
	}

	@Test
	void testPrototype() {
		Sheep dolly = new Sheep("Dolly", 1, "white");

		Sheep[] dollies = new Sheep[10];
		for (int i = 0; i < dollies.length; i++) {
			dollies[i] = dolly.clone();
			System.out.println(dollies[i]);
		}
	}

}
