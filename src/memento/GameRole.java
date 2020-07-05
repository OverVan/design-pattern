package memento;

/**
 * 游戏角色类
 * 
 * @author Van
 */
public class GameRole {
	// 角色名、攻击力、防御力
	private String name;
	private int attackPower;
	private int defendPower;

	public GameRole(String name, int attackPower, int defendPower) {
		this.name = name;
		this.attackPower = attackPower;
		this.defendPower = defendPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefendPower() {
		return defendPower;
	}

	public void setDefendPower(int defendPower) {
		this.defendPower = defendPower;
	}

	@Override
	public String toString() {
		return "GameRole [name=" + name + ", attackPower=" + attackPower + ", defendPower=" + defendPower + "]";
	}

	/**
	 * 保存状态到新的备忘录
	 * 
	 * @return 备忘录对象
	 */
	public Memento saveState() {
		return new Memento(attackPower, defendPower);
	}

	/**
	 * 通过备忘录恢复到过去的某一状态
	 * 
	 * @param memento 备忘录对象
	 */
	public void getState(Memento memento) {
		attackPower = memento.getAttackPower();
		defendPower = memento.getDefendPower();
	}
}
