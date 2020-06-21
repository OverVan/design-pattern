package factory.simpleFactory;

/**
 * 希腊披萨
 * 
 * @author Van
 */
public class GreekPizza extends Pizza {

	public GreekPizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The Greek pizza is being prepared.");
	}

}
