package decorator.original;

/**
 * 附加单品类-牛奶
 * 
 * @author Van
 *
 */
public class Milk {
	private String description;
	private double price;
	private int count;

	public Milk(int count) {
		super();
		this.description = "牛奶";
		this.price = 3;
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return price * count;
	}
}
