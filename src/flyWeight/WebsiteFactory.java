package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 * 
 * @author Van
 */
public class WebsiteFactory {
	// 各形式站点的存放池
	private Map<String, ConcreteWebsite> websitePool = new HashMap<>();

	/**
	 * 从池中获取所需形式的站点对象
	 * 
	 * @return 某形式的站点对象
	 */
	public Website getWebsite(String catagory) {
		// 若指定类别的站点存在，则直接拿，否则先新加入该类别的站点，再拿
		if (websitePool.containsKey(catagory))
			return (ConcreteWebsite) websitePool.get(catagory);
		websitePool.put(catagory, new ConcreteWebsite(catagory));
		return (ConcreteWebsite) websitePool.get(catagory);
	}

	/**
	 * 统计一下站点池中有多少种站点
	 * 
	 * @return 站点类别总数
	 */
	public int getCatagoryCount() {
		return websitePool.size();
	}
}
