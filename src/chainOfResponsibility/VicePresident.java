package chainOfResponsibility;

/**
 * 副校长类
 * 
 * @author Van
 */
public class VicePresident extends Approver {

	public VicePresident() {
		setName("副校长");
	}

	@Override
	public void processPurchase(Purchase purchase) {
		if (purchase.getPrice() > 10000 && purchase.getPrice() <= 30000)
			System.out.println(getName() + "审批，请求编号为：" + purchase.getId());
		else {
			System.out.println(getName() + "不能审批，上交给上一级");
			getNextApprover().processPurchase(purchase);
		}
	}

}
