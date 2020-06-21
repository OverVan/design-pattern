package builder.improve;

/**
 * 抽象建造者
 * 
 * @author Van
 */
public abstract class HouseBuilder {
	/**
	 * 造地基
	 */
	public abstract void buildBasic();

	/**
	 * 造墙
	 */
	public abstract void buildWall();

	/**
	 * 造屋顶
	 */
	public abstract void buildRoof();

	/**
	 * 完整流程
	 */
	public abstract House build();
}
