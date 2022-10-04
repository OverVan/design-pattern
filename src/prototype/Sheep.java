package prototype;

import java.io.Serializable;

public class Sheep implements Cloneable, Serializable {
	private static final long serialVersionUID = -109289151584356701L;

	private String name;
	private int age;
	// 验证深浅拷贝
	private Generation generation;

	public Sheep(String name, int age, Generation generation) {
		super();
		this.name = name;
		this.age = age;
		this.generation = generation;
	}

	public Sheep() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Generation getGeneration() {
		return generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", generation=" + generation + "]";
	}

	@Override
	protected Sheep clone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}
}
