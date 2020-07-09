package state;

import java.util.Random;

/**
 * 可抽奖状态类
 * 
 * @author Van
 */
public class CanRaffleState implements State {

	// 抽奖活动对象
	private Activity activity;

	public CanRaffleState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void reduceMoney() {
		// 当前状态无需再扣除积分
		System.out.println("【已在抽奖状态】已扣除积分");
	}

	@Override
	public boolean raffle() {
		// 当前状态可抽奖，10%的中奖概率
		System.out.println("【已在抽奖状态】正在抽奖");
		// 利用随机数模拟抽奖
		Random random = new Random();
		int number = random.nextInt(10);
		if (number == 0) {
			System.out.println("恭喜您中奖了！");
			// 转到分发奖品状态
			activity.setState(activity.getDispensePrizeState());
			return true;
		} else {
			System.out.println("很遗憾，您没有中奖");
			// 转到不抽奖状态
			activity.setState(activity.getNoRaffleState());
			return false;
		}
	}

	@Override
	public void dispensePrize() {
		// 当前状态不能分发奖品，结果还没出来
		System.out.println("【已在抽奖状态】尚不能分发奖品，待结果出来才能分发奖品");
	}

}
