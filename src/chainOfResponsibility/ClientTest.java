package chainOfResponsibility;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testApproval() {
		// 采购对象
		Purchase purchase = new Purchase(0, 5000.0f, 20);
		// 各级审批者对象
		Approver dean = new Dean();
		Approver principal = new Principal();
		Approver vicePresident = new VicePresident();
		Approver secretary = new Secretary();
		// 指定上一级或第一级（闭合）
		dean.setNextApprover(principal);
		principal.setNextApprover(vicePresident);
		vicePresident.setNextApprover(secretary);
		secretary.setNextApprover(dean);
		// 由于是闭合链，故从任意一级开始，都能找到最合适的审批者
		secretary.processPurchase(purchase);
	}

}
