package decorator.mine;

public class Topping {
	private String name;
	private float price = 0.0f;
	private int count;

	public Topping(String name, float price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public Topping() {
		this.name = "无";
		this.price = 0.0f;
		this.count = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * 计算总价
	 * 
	 * @return 总价格
	 */
	public float getTotalPrice() {
		return count * price;
	}
}
