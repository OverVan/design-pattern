package template;

/**
 * 豆浆制作模板类
 * 
 * @author Van
 */
public abstract class SoymilkMakeTemplate {
	/**
	 * 完整制作，不用重写
	 */
	public final void make() {
		selectMaterial();
		if (customizeCondiment())
			addCondiment();
		soakBean();
		beatBean();
	}

	/**
	 * 第一步：挑食材
	 */
	public void selectMaterial() {
		System.out.println("开始挑选食材");
	}

	/**
	 * 第二部：加配料
	 */
	public abstract void addCondiment();

	/**
	 * 第三部：泡豆子
	 */
	public void soakBean() {
		System.out.println("开始浸泡豆子");
	}

	/**
	 * 第四步：打豆子
	 */
	public void beatBean() {
		System.out.println("开始打豆子");
	}

	/**
	 * 自制定要不要配料
	 * 
	 * @return true：加；false：不加
	 */
	public boolean customizeCondiment() {
		// 默认要加
		return true;
	}
}
