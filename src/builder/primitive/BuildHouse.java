package builder.primitive;

/**
 * 抽象类-造房子
 * 
 * @author Van
 */
public abstract class BuildHouse {
	/**
	 * 打地基
	 */
	public void buildBasic() {

	}

	/**
	 * 搭结构
	 */
	public void buildStructure() {
		// TODO
	}

	/**
	 * 装修
	 */
	public void decorate() {

	}

	/**
	 * 完整流程，把房子造出来
	 */
	public void build() {
		buildBasic();
		buildStructure();
		decorate();
	}

}
