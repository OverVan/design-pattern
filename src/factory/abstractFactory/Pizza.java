package factory.abstractFactory;

/**
 * 抽象的产品类
 * 
 * @author Van
 */
public abstract class Pizza {
	// 品名
	protected String name;
	// 原料
	protected Dough dough;
	protected Saurce saurce;

	/**
	 * 依赖原料工厂
	 * 
	 * @param name
	 * @param pizzaIngredientFactory
	 */
	public Pizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
		this.name = name;
		this.dough = pizzaIngredientFactory.createDough();
		this.saurce = pizzaIngredientFactory.createSaurce();
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("bake for 25 minutes");
	}

	public void cut() {
		System.out.println("cut the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("place the pizza in offical box");
	}
}
