package singleton;

/**
 * 枚举
 * 
 * @author 21708
 *
 */
public class Test {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;

		System.out.println(instance1 == instance2);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		instance1.sayHello();
		instance2.sayHello();
	}

}

enum Singleton {

	INSTANCE;

	public void sayHello() {
		System.out.println("Hello");
	}

}