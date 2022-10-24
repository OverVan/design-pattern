package proxy.staticProxy;

/**
 * 代理类
 */
public class Lawyer implements Actionable {
	// 多态，为多个目标类服务
	private Actionable litigant;

	public Lawyer(Actionable litigant) {
		this.litigant = litigant;
	}

	/**
	 * 扩展目标类的功能
	 */
	@Override
	public void litigate() {
		System.out.println("开庭前的工作我律师来做");
		// 目标类原本的功能
		litigant.litigate();
		System.out.println("胜诉后的工作我律师来做");
	}
}
