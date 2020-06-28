package visitor;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testAssess() {
		ObjectStructure objectStructure = new ObjectStructure();
		// 两个男评委和两个女评委
		objectStructure.attach(new ManReferee());
		objectStructure.attach(new ManReferee());
		objectStructure.attach(new WomanReferee());
		objectStructure.attach(new WomanReferee());
		// 都给这哥们儿yes
		objectStructure.display(new Succeess());
		// 都给这哥们儿no
		objectStructure.display(new Fail());
	}

}
