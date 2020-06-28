package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 对象的数据结构，与数据操作相分离
 * 
 * @author Van
 */
public class ObjectStructure {
	// 评委列表
	private List<Referee> referees = new LinkedList<Referee>();

	/**
	 * 添加评委
	 * 
	 * @param referee
	 */
	public void attach(Referee referee) {
		referees.add(referee);
	}

	/**
	 * 移除评委
	 * 
	 * @param referee
	 */
	public void detach(Referee referee) {
		referees.remove(referee);
	}

	/**
	 * 展示评判结果
	 * 
	 * @param assess
	 */
	public void display(Assess assess) {
		for (Referee referee : referees)
			referee.accept(assess);
	}
}
