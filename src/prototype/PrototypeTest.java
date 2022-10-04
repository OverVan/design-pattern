package prototype;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PrototypeTest {

	@Test
	void testTraditional() {
		Prototype prototype = new Prototype();
		Sheep dolly = new Sheep("dolly", 2, new Generation(2, "tommy"));
		System.out.println(Arrays.toString(prototype.simpleCopy(dolly, 3)));
		Sheep[] sheeps = prototype.loopCopy(dolly, 3);
		System.out.println(Arrays.toString(sheeps));
		// 浅拷贝，把拷贝出来的羊的代际改掉
		sheeps[1].getGeneration().setId(3);
		// 多利的代际跟着变了
		System.out.println(dolly.getGeneration());
	}

	@Test
	void testPrototype() throws Exception {
		Sheep dolly = new Sheep("dolly", 2, new Generation(2, "tommy"));
		Prototype prototype = new Prototype();
		Sheep sheep = prototype.cloneSheep(dolly);
		// 默认的clone也是浅拷贝
		sheep.getGeneration().setId(3);
		System.out.println(dolly.getGeneration());
	}

	@Test
	void testAny() throws Exception {
		Sheep dolly = new Sheep("dolly", 2, new Generation(2, "tommy"));
		Prototype prototype = new Prototype();
		Sheep copy = prototype.copyAny(dolly);
		copy.getGeneration().setResearcher("tom");
		System.out.println(dolly.getGeneration());
		Sheep clone = prototype.cloneAny(dolly);
		clone.getGeneration().setId(3);
		System.out.println(dolly.getGeneration());
	}

	@Test
	void testDeep() throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Sheep dolly = new Sheep("dolly", 2, new Generation(2, "tommy"));
		Prototype prototype = new Prototype();
		Sheep copy = prototype.deepCopy(dolly);
		copy.getGeneration().setResearcher("tom");
		// 没变
		System.out.println(dolly.getGeneration());
		Sheep clone = prototype.deepClone(dolly);
		clone.getGeneration().setId(3);
		// 没变
		System.out.println(dolly.getGeneration());
	}

}
