package factory.abstractFactory;

/**
 * 具体的产品类
 * 
 * @author Van
 *
 */
public class CheesePizza extends Pizza {
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super("CheesPizza", pizzaIngredientFactory);
	}

	@Override
	public void prepare() {
		System.out.println("prepare " + name);
		System.out.println("add " + dough.getName());
		System.out.println("add " + saurce.getName());
		System.out.println("add senior cheesse");
	}
}
