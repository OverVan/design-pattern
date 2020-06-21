package factory.simpleFactory;

/**
 * 奶酪披萨
 * 
 * @author Van
 */
public class CheesePizza extends Pizza {

	public CheesePizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The cheese pizza is being prepared.");
	}

}
