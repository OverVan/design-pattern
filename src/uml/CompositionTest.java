package uml;

import org.junit.jupiter.api.Test;

public class CompositionTest {

	@Test
	void test() {
		Body body = new Body();
		// eye属性引用的Eye对象随着body对象销毁而销毁
		System.out.println(body);
	}

}

class Body {
	// 作域是前提，先有关联关系，再往组合关系发展
	private Eye eye;

	/**
	 * 不提供带参构造器，以防止组合变聚合
	 */
	public Body() {
		// 构造Person对象同时构造Eye对象
		this.eye = new Eye();
	}

	@Override
	public String toString() {
		return "Body [eye=" + eye + "]";
	}
}

class Eye {
	public Eye() {
		super();
	}
}
