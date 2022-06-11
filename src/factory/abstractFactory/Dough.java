package factory.abstractFactory;

/**
 * 抽象的产品类-披萨原料-面团
 * 
 * @author Van
 *
 */
public abstract class Dough {
	private String name;

	public Dough(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
