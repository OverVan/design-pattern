package strategy.improve;

/**
 * 鸣叫实现类-哑巴
 * 
 * @author Van
 */
public class NoQuack implements Quack {

	@Override
	public void quack() {
		System.out.println("(手动嘎嘎叫)");
	}

}
