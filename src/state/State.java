package state;

/**
 * 状态接口
 * 
 * @author Van
 */
public interface State {
	/**
	 * 扣除积分，准备抽奖
	 */
	void reduceMoney();

	/**
	 * 能否抽奖
	 * 
	 * @return true：能；false：否
	 */
	boolean raffle();

	/**
	 * 抽完奖且中奖，分发奖品
	 */
	void dispensePrize();
}
