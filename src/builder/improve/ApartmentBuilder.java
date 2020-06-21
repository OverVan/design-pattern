package builder.improve;

/**
 * 具体建造者-公寓建造者
 * 
 * @author Van
 */
public class ApartmentBuilder extends HouseBuilder {
	// 公寓
	private House house = new House();

	@Override
	public void buildBasic() {
		house.setBasic("公寓的地基");
	}

	@Override
	public void buildWall() {
		house.setWall("公寓的墙");
	}

	@Override
	public void buildRoof() {
		house.setRoof("公寓的屋顶");
	}

	@Override
	public House build() {
		buildBasic();
		buildWall();
		buildRoof();
		// 得到成品公寓
		return house;
	}

}
