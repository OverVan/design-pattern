package builder.improve;

/**
 * 建造总指挥
 * 
 * @author Van
 */
public class HouseDirector {
	// 建造者
	private HouseBuilder houseBuilder;

	/**
	 * 构造器（向上转型）
	 * 
	 * @param houseBuilder 建造者的实现类
	 */
	public HouseDirector(HouseBuilder houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}

	public HouseBuilder getHouseBuilder() {
		return houseBuilder;
	}

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * 指挥建造者造出房子
	 * 
	 * @return 房子
	 */
	public House constructHouse() {
		return houseBuilder.build();
	}
}
