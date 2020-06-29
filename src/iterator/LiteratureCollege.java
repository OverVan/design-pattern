package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 文学院实现类
 * 
 * @author Van
 */
public class LiteratureCollege implements College {

	// 学院名
	private String name = "文学院";
	// 下属专业
	private List<Department> departments = new ArrayList<Department>();

	/**
	 * 内部填好专业列表
	 */
	public LiteratureCollege() {
		departments.add(new Department("中国文学系"));
		departments.add(new Department("外国文学系"));
		departments.add(new Department("甲骨文研究所"));
	}

	@Override
	public String getCollegeName() {
		return name;
	}

	@Override
	public void addDepartment(String name) {
		departments.add(new Department(name));
	}

	@Override
	public Iterator<Department> createIterator() {
		// 传入专业列表，返回作用其上的迭代器
		return new LiteratureCollegeIterator(departments);
	}

}
