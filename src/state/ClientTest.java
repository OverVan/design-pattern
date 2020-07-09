package state;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testState() {
		// 创建抽奖活动对象，指定初始奖品数为1
		Activity activity = new Activity(10);
		// 连续抽300次
		for (int i = 0; i < 300; i++) {
			System.out.println("======第" + (i + 1) + "次抽奖======");
			// 先扣除积分，再抽奖
			activity.deductMoney();
			activity.raffle();
		}
	}

}
