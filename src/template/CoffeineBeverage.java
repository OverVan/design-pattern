package template;

/**
 * 咖啡因饮料 PS：茶也含咖啡因
 */
public abstract class CoffeineBeverage {
	/**
	 * 模板方法
	 */
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	/**
	 * 带钩子的模板方法
	 */
	public final void prepareRecipeWithHook() {
		// 随便搞几个钩子，前后两个便于子类选择性插入特定步骤
		preProcess();
		boilWater();
		brew();
		pourInCup();
		// 这里的钩子便于子类任务根据条件决定加配料与否
		if (customerWantsCondiments()) {
			addCondiments();
		}
		postProcess();
	}

	/**
	 * 钩子，默认实现
	 * 
	 * @return
	 */
	public boolean customerWantsCondiments() {
		return true;
	}

	/**
	 * 钩子，空实现
	 */
	public void postProcess() {
	}

	/**
	 * 钩子，空实现
	 */
	public void preProcess() {
	}

	/**
	 * 烧水 公共逻辑
	 */
	public void boilWater() {
		System.out.println("A barista is boiling water.");
	}

	/**
	 * 入杯 公共逻辑
	 */
	public void pourInCup() {
		System.out.println("A barista is pouring the beverage into the cup.");
	}

	/**
	 * 沏
	 */
	public abstract void brew();

	/**
	 * 加配料
	 */
	public abstract void addCondiments();
}
