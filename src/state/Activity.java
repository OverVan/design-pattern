package state;

/**
 * 抽奖活动类
 * 
 * @author Van
 */
public class Activity {
	// 抽奖活动的当前状态
	private State state;
	// 奖品数量
	private int count = 0;
	// 组合抽奖活动的四种状态
	private NoRaffleState noRaffleState = new NoRaffleState(this);
	private CanRaffleState canRaffleState = new CanRaffleState(this);
	private DispensePrizeState dispensePrizeState = new DispensePrizeState(this);
	private DispenseOutState dispenseOutState = new DispenseOutState(this);

	public Activity(int count) {
		// 初始是不能抽奖状态
		this.state = getNoRaffleState();
		this.count = count;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		// 先返回当前奖品数，再将其减1
		return count--;
	}

	public NoRaffleState getNoRaffleState() {
		return noRaffleState;
	}

	public CanRaffleState getCanRaffleState() {
		return canRaffleState;
	}

	public DispensePrizeState getDispensePrizeState() {
		return dispensePrizeState;
	}

	public DispenseOutState getDispenseOutState() {
		return dispenseOutState;
	}

	/**
	 * 调用当前状态的reduceMoney方法
	 */
	public void deductMoney() {
		state.reduceMoney();
	}

	/**
	 * 若当前状态的raffle方法为真，则调用当前状态的dispensePrize方法
	 * 
	 * @return
	 */
	public void raffle() {
		if (state.raffle())
			state.dispensePrize();
	}

}
