package state;

/**
 * 分发奖品状态类
 * 
 * @author Van
 */
public class DispensePrizeState implements State {

	// 抽奖活动对象
	private Activity activity;

	public DispensePrizeState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void reduceMoney() {
		// 当前状态无需再扣除积分
		System.out.println("【发放奖品状态】已扣除积分");
	}

	@Override
	public boolean raffle() {
		// 当前状态已过抽奖环节
		System.out.println("【发放奖品状态】已抽过奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		// 当前状态可分发奖品
		int currentCount = activity.getCount();// 当前奖品数
		if (currentCount > 0) {
			System.out.println("正在为您发放奖品，您得到的是第" + currentCount + "个奖品");
			// 转到不抽奖状态
			activity.setState(activity.getNoRaffleState());
		} else {
			System.out.println("很遗憾，您来迟一步，奖品已发完");
			// 转到奖品发完状态
			activity.setState(activity.getDispenseOutState());
		}
	}

}
