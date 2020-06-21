package decorator.mine;

import java.util.List;

public class Coffee {
	private String name;
	private float price = 0.0f;
	private List<Topping> toppings;
	private int count;

	public Coffee(String name, float price, List<Topping> toppings, int count) {
		super();
		this.name = name;
		this.price = price;
		this.toppings = toppings;
		this.count = count;
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

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
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
		float totalToppingPrice = 0.0f;
		for (Topping topping : toppings)
			totalToppingPrice += topping.getTotalPrice();
		return count * (price + totalToppingPrice);
	}
}
