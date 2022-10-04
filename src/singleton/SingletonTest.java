package singleton;

import org.junit.jupiter.api.Test;

public class SingletonTest {
	@Test
	void testHungryStaticFinal() {
		HungryStaticFinal singleton1 = HungryStaticFinal.getInstance();
		HungryStaticFinal singleton2 = HungryStaticFinal.getInstance();
		// 默认toString方法，含地址
		System.out.println(singleton1 == singleton2);
	}

	@Test
	void testEnumSingleton() {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		// 默认hashCode方法，比地址
		System.out.println(singleton1.hashCode() == singleton2.hashCode());
	}

	@Test
	void testHungryStaticBlock() {
		HungryStaticBlock singleton1 = HungryStaticBlock.getInstance();
		HungryStaticBlock singleton2 = HungryStaticBlock.getInstance();
		System.out.println(singleton1 == singleton2);
	}

	@Test
	void testLazy() {
		Lazy singleton1 = Lazy.getInstance();
		Lazy singleton2 = Lazy.getInstance();
		System.out.println(singleton1 == singleton2);
	}

	@Test
	void testLazyDoubleCheck() {
		LazyDoubleCheck singleton1 = LazyDoubleCheck.getInstance();
		LazyDoubleCheck singleton2 = LazyDoubleCheck.getInstance();
		System.out.println(singleton1 == singleton2);
	}

	@Test
	void testLazyStaticInner() {
		LazyStaticInner.InnerSingleton singleton1 = LazyStaticInner.getInstance();
		LazyStaticInner.InnerSingleton singleton2 = LazyStaticInner.getInstance();
		System.out.println(singleton1.hashCode() == singleton2.hashCode());
	}

	@Test
	void testLazySynchronizedBlock() {
		LazySynchronizedBlock singleton1 = LazySynchronizedBlock.getInstance();
		LazySynchronizedBlock singleton2 = LazySynchronizedBlock.getInstance();
		System.out.println(singleton1 == singleton2);
	}

	@Test
	void testLazySynchronizedMethod() {
		LazySynchronizedMethod singleton1 = LazySynchronizedMethod.getInstance();
		LazySynchronizedMethod singleton2 = LazySynchronizedMethod.getInstance();
		// 默认equals方法比地址
		System.out.println(singleton1.equals(singleton2));
	}
}