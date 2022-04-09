package proxy.staticProxy;

import org.junit.jupiter.api.Test;

public class ClientTest {
	@Test
	void testStaticProxy() {
		// 为不同目标对象切入相同的扩展工作
		Actionable lawyer = new Lawyer(new Professor());
		lawyer.litigate();
		lawyer = new Lawyer(new Wife());
		lawyer.litigate();
	}
}
