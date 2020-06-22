package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 院系组件类，管理下一级专业组件
 * 
 * @author Van
 */
public class College extends OrganizationComponent {

	// 专业列表
	List<OrganizationComponent> components = new LinkedList<OrganizationComponent>();

	public College(String name, String description) {
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

	@Override
	protected void print() {
		System.out.println("  " + getName());
		for (OrganizationComponent component : components)
			component.print();
	}

}
