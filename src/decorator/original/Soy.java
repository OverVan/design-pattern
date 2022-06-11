package decorator.original;

/**
 * 附加单品类-豆浆
 * 
 * @author Van
 *
 */
public class Soy {
	private String description;
	private double price;
	private int count;

	public Soy(int count) {
		super();
		this.description = "豆浆";
		this.price = 2;
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return price * count;
	}
}
