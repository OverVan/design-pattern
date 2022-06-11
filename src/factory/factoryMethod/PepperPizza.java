package factory.factoryMethod;

/**
 * 具体的产品类
 * 
 * @author Van
 *
 */
public class PepperPizza extends Pizza {
	public PepperPizza() {
		super("PepperPizza", "ordinary dough", "ordinary saurce");
	}

	@Override
	public void prepare() {
		System.out.println("prepare " + getName());
		System.out.println("add " + getDough());
		System.out.println("add " + getSaurce());
		System.out.println("add senior pepper");
	}

	@Override
	public void cut() {
		System.out.println("cut the pizza into square slices");
	}
}
