package iterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testMyIterator() {
		List<College> colleges = new ArrayList<College>();
		colleges.add(new ComputerCollege());
		colleges.add(new LiteratureCollege());
		OutPutImpl outPutImpl = new OutPutImpl(colleges);
		outPutImpl.printColleges();
	}

}
