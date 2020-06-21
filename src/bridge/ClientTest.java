package bridge;

import org.junit.jupiter.api.Test;

/**
 * 客户端
 * 
 * @author Van
 */
class ClientTest {

	/**
	 * 测试小米滑屏手机
	 */
	@Test
	void testSlideMi() {
		SlidePhone slideMi = new SlidePhone(new Mi());
		slideMi.open();
		slideMi.call();
	}

	/**
	 * 测试直立按键Vivo手机
	 */
	@Test
	void testUpRightVivo() {
		UpRightPhone upRightVivo = new UpRightPhone(new Vivo());
		upRightVivo.open();
		upRightVivo.close();
	}

	/**
	 * 测试华为翻盖手机
	 */
	@Test
	void testFolderHuawei() {
		FolderPhone folderHuawei = new FolderPhone(new Huawei());
		folderHuawei.open();
	}

	@Test
	void testGoldenSlideMi() {
		GoldenPhone goldenSlideMi = new GoldenPhone(new SlidePhone(new Mi()));
		goldenSlideMi.playGame();
	}

}
