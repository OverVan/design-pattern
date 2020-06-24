package flyWeight;

/**
 * 指明形式的具体站点类，继承抽象站点类
 * 
 * @author Van
 */
public class ConcreteWebsite extends Website {

	// 网站类别或发布形式
	private String catagory;

	public ConcreteWebsite(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为：" + catagory + "；" + "此类站点的使用者为：" + user.getName());
	}

}
