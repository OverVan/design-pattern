package factory.simpleFactory;

/**
 * 抽象的披萨类
 * 
 * @author Van
 */
public abstract class Pizza {
	// 品名
	private String name;
	// 原料
	private String dough;
	private String saurce;

	public Pizza(String name, String dough, String saurce) {
		this.name = name;
		this.dough = dough;
		this.saurce = saurce;
	}

	public String getName() {
		return name;
	}

	public String getDough() {
		return dough;
	}

	public String getSaurce() {
		return saurce;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("bake for 25 minutes");
	}

	public void cut() {
		System.out.println("cut the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("place the pizza in offical box");
	}
}
