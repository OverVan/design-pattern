package observer.ordinary;

import org.junit.jupiter.api.Test;

public class NoObserverTest {
	@Test
	void testWeather() {
		// 创建数据订阅方-第三方平台
		BaiduWeather baiduWeather = new BaiduWeather();
		SinaWeather sinaWeather = new SinaWeather();
		// 创建数据发布方并注册数据订阅方
		WeatherData weatherData = new WeatherData(baiduWeather, sinaWeather);

		// 气象站测量并更新数据
		weatherData.setMeasurements(30.0f, 150.0f, 40.0f);
		// 更新通知
		weatherData.measuermentsChanged();
		weatherData.measuermentsChanged();
		// 第三方平台展示数据
		baiduWeather.display();
		sinaWeather.display();

		// 气象站再次测量并更新数据
		weatherData.setMeasurements(32.0f, 160.0f, 20.0f);
		// 更新通知
		weatherData.measuermentsChanged();
		weatherData.measuermentsChanged();
		// 平台展示
		baiduWeather.display();
		sinaWeather.display();
	}
}
