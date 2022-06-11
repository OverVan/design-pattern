package uml;

import org.junit.jupiter.api.Test;

public class AggregationTest {

	@Test
	void test() {
		Water water = new Water();
		Person person = new Person("van", water);
		System.out.println(person);
		System.out.println(water);
	}

}

class Person {
	private String name;
	// 作域是前提，先有关联关系，再往聚合关系发展
	private Water water;

	public Person(String name, Water water) {
		super();
		this.name = name;
		this.water = water;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", water=" + water + "]";
	}
}

class Water {
	public Water() {
		super();
	}
}
