package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 文学院迭代器
 * 
 * @author Van
 */
public class LiteratureCollegeIterator implements Iterator<Department> {

	// 下属专业（由外部指定）
	private List<Department> departments;
	// 遍历到的当前索引
	private int index = -1;

	public LiteratureCollegeIterator(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public boolean hasNext() {
		if (index + 1 >= departments.size())
			return false;
		// 后移1位
		index++;
		return true;
	}

	@Override
	public Department next() {
		// 取当前元素
		return departments.get(index);
	}

}
