package chainOfResponsibility;

/**
 * 党委书记类
 * 
 * @author Van
 */
public class Secretary extends Approver {

	public Secretary() {
		setName("党委书记");
	}

	@Override
	public void processPurchase(Purchase purchase) {
		if (purchase.getPrice() > 30000)
			System.out.println(getName() + "审批，请求编号为：" + purchase.getId());
		else {
			System.out.println(getName() + "不能审批，回到第一级");
			getNextApprover().processPurchase(purchase);
		}
	}

}
