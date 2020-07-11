package chainOfResponsibility;

/**
 * 审批者类
 * 
 * @author Van
 */
public abstract class Approver {
	// 上一级或第一级审批者
	private Approver nextApprover;
	// 审批者名
	private String name;

	public Approver getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(Approver nextApprover) {
		this.nextApprover = nextApprover;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 处理采购
	 */
	public abstract void processPurchase(Purchase purchase);
}
