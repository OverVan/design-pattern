package factory.simpleFactory;

/**
 * 胡椒披萨
 * 
 * @author Van
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

	/**
	 * 灵活覆盖
	 */
	@Override
	public void cut() {
		System.out.println("cut the pizza into square slices");
	}
}
