package factory.ordinary;

/**
 * 奶酪披萨
 * 
 * @author Van
 */
public class CheesePizza extends Pizza {
	public CheesePizza() {
		super("CheesPizza", "ordinary dough", "ordinary saurce");
	}

	@Override
	public void prepare() {
		System.out.println("prepare " + getName());
		System.out.println("add " + getDough());
		System.out.println("add " + getSaurce());
		System.out.println("add senior cheesse");
	}
}
