package composite;

/**
 * 对树状结构中各级结点的统一抽象
 * 
 * @author Van
 */
public abstract class OrganizationComponent {
	// 机构名
	private String name;
	// 描述
	private String description;

	public OrganizationComponent(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 增加子组件。不用abstract修饰，叶子结点不必重写add方法
	 */
	protected void add(OrganizationComponent component) {
		// 默认实现
		throw new UnsupportedOperationException();
	}

	/**
	 * 删除子组件。不用abstract修饰，叶子结点不必重写remove方法
	 */
	protected void remove(OrganizationComponent component) {
		// 默认实现
		throw new UnsupportedOperationException();
	}

	/**
	 * 打印本组件信息。无论叶子结点还是非叶子结点，都要print方法，故用abstract修饰
	 */
	protected abstract void print();
}
