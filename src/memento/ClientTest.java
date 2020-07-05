package memento;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testMemento() {
		// 创造两种角色
		GameRole role1 = new GameRole("关公", 200, 100);
		GameRole role2 = new GameRole("秦琼", 200, 200);
		System.out.println("======原始状态======");
		System.out.println(role1);
		System.out.println(role2);
		// 存储原始状态
		List<String> names = new ArrayList<String>();
		names.add(role1.getName());
		names.add(role2.getName());
		CareTaker careTaker = new CareTaker(names);
		careTaker.addMemento(role1.getName(), role1.saveState());
		careTaker.addMemento(role2.getName(), role2.saveState());
		// 俩哥们大战boss，导致状态改变
		role1.setAttackPower(100);
		role1.setDefendPower(50);
		role2.setAttackPower(80);
		role2.setDefendPower(100);
		System.out.println("======大战boss后的状态======");
		System.out.println(role1);
		System.out.println(role2);
		// 俩哥们恢复状态
		role1.getState(careTaker.getMemento(role1.getName(), 0));
		role2.getState(careTaker.getMemento(role2.getName(), 0));
		System.out.println("======恢复状态======");
		System.out.println(role1);
		System.out.println(role2);
	}

}
