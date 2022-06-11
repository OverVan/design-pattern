package factory.abstractFactory;

/**
 * 具体的产品类
 * 
 * @author Van
 *
 */
public class PepperPizza extends Pizza {
	public PepperPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super("PepperPizza", pizzaIngredientFactory);
	}

	@Override
	public void prepare() {
		System.out.println("prepare " + name);
		System.out.println("add " + dough.getName());
		System.out.println("add " + saurce.getName());
		System.out.println("add senior pepper");
	}

	@Override
	public void cut() {
		System.out.println("cut the pizza into square slices");
	}
}
