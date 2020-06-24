package flyWeight;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class Client {

	@Test
	void testWebsiteCatagory() {
		WebsiteFactory websiteFactory = new WebsiteFactory();
		Website website1 = websiteFactory.getWebsite("新闻");
		website1.use(new User("小明"));

		Website website2 = websiteFactory.getWebsite("博客");
		website2.use(new User("小红"));
		Website website3 = websiteFactory.getWebsite("博客");
		website3.use(new User("小刚"));

		Website website4 = websiteFactory.getWebsite("微信公众号");
		website4.use(new User("小华"));
		Website website5 = websiteFactory.getWebsite("微信公众号");
		website5.use(new User("小张"));

		System.out.println("现有站点的总数为：" + websiteFactory.getCatagoryCount());
	}

}
