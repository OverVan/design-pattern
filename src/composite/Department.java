package composite;

/**
 * 目前专业组件类是叶子结点，无下一级组件可管理，无需重写add和remove方法
 * 
 * @author Van
 */
public class Department extends OrganizationComponent {

	public Department(String name, String description) {
		super(name, description);
	}

	@Override
	protected void print() {
		System.out.println("      " + getName());
	}

}
