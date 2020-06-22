package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 大学组件类，管理下一级院系组件
 * 
 * @author Van
 */
public class University extends OrganizationComponent {

	// 院系列表
	private List<OrganizationComponent> components = new LinkedList<OrganizationComponent>();

	public University(String name, String description) {
		super(name, description);
	}

	@Override
	protected void add(OrganizationComponent component) {
		components.add(component);
	}

	@Override
	protected void remove(OrganizationComponent component) {
		components.remove(component);
	}

	/**
	 * 打印所含院系
	 */
	@Override
	protected void print() {
		System.out.println("======" + getName() + "======");
		for (OrganizationComponent component : components)
			component.print();
	}

}
