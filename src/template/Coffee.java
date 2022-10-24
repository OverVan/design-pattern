package template;

import java.util.Scanner;

/**
 * 咖啡-遵循模板做任务的子类
 */
public class Coffee extends CoffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Bresing the coffee beans.");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding some sugar and milk.");
	}

	/**
	 * 选择条件控制
	 */
	@Override
	public boolean customerWantsCondiments() {
		System.out.println("Need some sugar and milk?");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		scanner.close();
		if (choice.equals("y")) {
			return true;
		}
		return false;
	}

	/**
	 * 选择插入预处理步骤
	 */
	@Override
	public void preProcess() {
		System.out.println("Filtering out the finest beans");
	}

}
