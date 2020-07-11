package chainOfResponsibility;

/**
 * 系主任类
 * 
 * @author Van
 */
public class Dean extends Approver {

	public Dean() {
		setName("系主任");
	}

	@Override
	public void processPurchase(Purchase purchase) {
		if (purchase.getPrice() <= 5000)
			System.out.println(getName() + "审批，请求编号为：" + purchase.getId());
		else {
			System.out.println(getName() + "不能审批，上交给上一级");
			getNextApprover().processPurchase(purchase);
		}
	}
}
