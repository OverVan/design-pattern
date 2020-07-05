package memento;

/**
 * 备忘录类
 * 
 * @author Van
 */
public class Memento {
	// 攻击力、防御力
	private int attackPower;
	private int defendPower;

	public Memento(int attackPower, int defendPower) {
		this.attackPower = attackPower;
		this.defendPower = defendPower;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getDefendPower() {
		return defendPower;
	}
}
