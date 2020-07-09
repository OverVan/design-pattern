package strategy.improve;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testStrategy() {
		Duck wildDuck = new WildDuck();
		wildDuck.fly();
		wildDuck.quack();
		Duck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		pekingDuck.quack();
		Duck toyDuck = new ToyDuck();
		toyDuck.fly();
		toyDuck.quack();
		// 动态改变北京烤鸭的能力
		pekingDuck.setFly(new PoorFly());
		pekingDuck.fly();
	}

}
