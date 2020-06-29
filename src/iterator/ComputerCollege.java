package iterator;

import java.util.Iterator;

/**
 * 计算机学院实现类
 * 
 * @author Van
 */
public class ComputerCollege implements College {

	// 学院名
	private String name = "计算机学院";
	// 下属专业
	private Department[] departments;
	// 数组当前对象总数
	private int departmentCount = 0;

	/**
	 * 在内部填好专业数组
	 */
	public ComputerCollege() {
		this.departments = new Department[10];
		departments[0] = new Department("数字媒体技术");
		departments[1] = new Department("软件工程");
		departments[2] = new Department("网络工程");
		departments[3] = new Department("计算机科学与技术");
		departments[4] = new Department("大数据");
	}

	@Override
	public String getCollegeName() {
		return name;
	}

	@Override
	public void addDepartment(String name) {
		// 装填当前元素
		departments[departmentCount] = new Department(name);
		// 预装填下一元素
		departmentCount++;
	}

	@Override
	public Iterator<Department> createIterator() {
		// 传入专业数组，返回作用其上的迭代器
		return new ComputerCollegeIterator(departments);
	}
}
