package builder.improve;

/**
 * 具体建造者-小屋建造者
 * 
 * @author Van
 */
public class CabinBuilder extends HouseBuilder {
	// 小木屋
	private House house = new House();

	@Override
	public void buildBasic() {
		house.setBasic("小木屋的地基");
	}

	@Override
	public void buildWall() {
		house.setWall("小木屋的墙");
	}

	@Override
	public void buildRoof() {
		house.setRoof("小木屋的屋顶");
	}

	@Override
	public House build() {
		buildBasic();
		buildWall();
		buildRoof();
		// 得到成品小木屋
		return house;
	}

}
