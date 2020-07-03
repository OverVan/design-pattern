package observer.ordinary;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
public class ClientTest {
	@Test
	void testWeather() {
		// 创建数据接入方
		CurrentConditions currentConditions = new CurrentConditions();
		// 创建数据提供方并与接入方相关联
		WeatherData weatherData = new WeatherData(currentConditions);
		// 联动更新数据
		weatherData.updateInnerData(30.0f, 150.0f, 40.0f);
		// 联动更新数据
		weatherData.updateInnerData(32.0f, 160.0f, 20.0f);
	}
}
