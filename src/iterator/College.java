package iterator;

import java.util.Iterator;

/**
 * 学院接口
 * 
 * @author Van
 */
public interface College {
	/**
	 * 返回学院名
	 * 
	 * @return
	 */
	String getCollegeName();

	/**
	 * 增加一个专业
	 * 
	 * @param name 专业名
	 */
	void addDepartment(String name);

	/**
	 * 返回一个作用于当前学院的迭代器
	 * 
	 * @return
	 */
	Iterator<Department> createIterator();
}
