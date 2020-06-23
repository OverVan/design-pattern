package decorator.anotherMine;

/**
 * 抽象类-饮料，可派生出咖啡、茶等
 * 
 * @author Van
 */
public abstract class Drink {
	// 描述
	private String description;
	// 单价
	private float price = 0.0f;

	public Drink(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 单品只算单价，配品可算多份的，故各自覆盖
	 * 
	 * @return
	 */
	public abstract float cost();
}
