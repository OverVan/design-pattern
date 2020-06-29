package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 输出实现类，打印遍历结果
 * 
 * @author Van
 */
public class OutPutImpl {
	// 学院列表
	private List<College> colleges;

	/**
	 * 从外部传入学院列表
	 * 
	 * @param colleges 学院列表
	 */
	public OutPutImpl(List<College> colleges) {
		this.colleges = colleges;
	}

	/**
	 * 遍历打印所有学院，包括遍历打印各学院下属所有专业
	 */
	public void printColleges() {
		// 得到列表自带的迭代器
		Iterator<College> collegeIterator = colleges.iterator();
		while (collegeIterator.hasNext()) {
			College college = collegeIterator.next();
			System.out.println(college.getCollegeName());
			// 得到自制的学院迭代器，遍历其下所有专业
			Iterator<Department> departmentIterator = college.createIterator();
			printDepartments(departmentIterator);
		}
	}

	/**
	 * 遍历打印某学院下属所有专业
	 * 
	 * @param departmentIterator 作用于该学院的迭代器
	 */
	public void printDepartments(Iterator<Department> departmentIterator) {
		while (departmentIterator.hasNext())
			System.out.println("\t" + departmentIterator.next().getDepartmentName());
	}
}
