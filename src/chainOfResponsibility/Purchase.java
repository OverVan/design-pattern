package chainOfResponsibility;

/**
 * 采购类
 * 
 * @author Van
 */
public class Purchase {
	// 类型、金额、编号
	private int type = 0;
	private float price = 0.0f;
	private int id = 0;

	public Purchase(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}
}
