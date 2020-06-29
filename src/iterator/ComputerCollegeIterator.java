package iterator;

import java.util.Iterator;

/**
 * 计算机学院迭代器
 * 
 * @author Van
 */
public class ComputerCollegeIterator implements Iterator<Department> {

	// 下属专业（由外部指定）
	private Department[] departments;
	// 遍历到的当前下标
	private int position = -1;

	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}

	@Override
	public boolean hasNext() {
		// 下一个下标越界或下一个元素引用null
		if (position + 1 >= departments.length || departments[position + 1] == null)
			return false;
		// 后移1位
		position++;
		return true;
	}

	@Override
	public Department next() {
		// 取当前元素
		return departments[position];
	}

}
