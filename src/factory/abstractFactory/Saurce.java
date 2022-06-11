package factory.abstractFactory;

/**
 * 抽象的产品类-披萨原料-酱料
 * 
 * @author Van
 *
 */
public abstract class Saurce {
	private String name;

	public Saurce(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
