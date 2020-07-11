package chainOfResponsibility;

/**
 * 院长类
 * 
 * @author Van
 */
public class Principal extends Approver {

	public Principal() {
		setName("院长");
	}

	@Override
	public void processPurchase(Purchase purchase) {
		if (purchase.getPrice() > 5000 && purchase.getPrice() <= 10000)
			System.out.println(getName() + "审批，请求编号为：" + purchase.getId());
		else {
			System.out.println(getName() + "不能审批，上交给上一级");
			getNextApprover().processPurchase(purchase);
		}
	}

}
