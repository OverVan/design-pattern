package mediator;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testMeidator() {
		// 创建中介者
		Mediator householdMediator = new HouseholdMediator();
		// 创建诸家电
		Household alarm = new Alarm("时钟", householdMediator);
		Household coffeeMachine = new CoffeeMachine("咖啡机", householdMediator);
		Household television = new Television("电视机", householdMediator);
		// 开工
		alarm.sendMessage(1);
		coffeeMachine.sendMessage(1);
		television.sendMessage(1);
		// 休工
		alarm.sendMessage(0);
		coffeeMachine.sendMessage(0);
		television.sendMessage(0);
	}

}
