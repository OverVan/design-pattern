package factory.simpleFactory;

/**
 * 披萨抽象类
 * 
 * @author Van
 */
public abstract class Pizza {

	// 显然，每种披萨都有自己独一无二的名字
	private String name;

	public Pizza(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 不同披萨的准备工序不一样
	 */
	public abstract void prepare();

	public void bake() {
		System.out.println(name + " is being baked.");
	}

	public void cut() {
		System.out.println(name + " is being cut.");
	}

	public void box() {
		System.out.println(name + " is being boxed.");
	}

}
