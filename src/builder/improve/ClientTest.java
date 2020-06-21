package builder.improve;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testBuildCabin() {
		// 勒令指挥者完成一套小木屋
		HouseDirector houseDirector = new HouseDirector(new CabinBuilder());
		House house = houseDirector.constructHouse();
		System.out.println(house);
	}

	@Test
	void testBuildApartment() {
		// 勒令指挥者完成一套公寓
		HouseDirector houseDirector = new HouseDirector(new ApartmentBuilder());
		House house = houseDirector.constructHouse();
		System.out.println(house);
	}
}
