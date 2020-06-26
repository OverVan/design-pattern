package template;

/**
 * 纯豆浆，什么配料都不加
 * 
 * @author Van
 */
public class PureSoymilkMake extends SoymilkMakeTemplate {

	/**
	 * 不加配料
	 */
	@Override
	public boolean customizeCondiment() {
		return false;

	}

	@Override
	public void addCondiment() {
		// 空实现
	}

}
