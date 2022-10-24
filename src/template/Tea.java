package template;

import java.util.Scanner;

/**
 * 茶-遵循模板做任务的子类
 */
public class Tea extends CoffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Brewing the tea leaves.");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding some lemon slices.");
	}

	/**
	 * 选择条件控制
	 */
	@Override
	public boolean customerWantsCondiments() {
		System.out.println("Need some lemon splices?");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		scanner.close();
		if (choice.equals("y")) {
			return true;
		}
		return false;
	}

	/**
	 * 选择插入后处理步骤
	 */
	@Override
	public void postProcess() {
		System.out.println("Packaging your tea.");
	}

}
