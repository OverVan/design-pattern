package decorator;

/**
 * 饮料类
 * 
 * @author Van
 */
public abstract class Drink {
	// 饮料描述
	private String description;
	// 单价
	private float price = 0.0f;

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
	 * 计算总价
	 * 
	 * @return 总价格
	 */
	protected abstract float cost();
}
