package observer.observer;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class Netizen {

	@Test
	void testWeather() {
		// 创建气象站-发布者
		WeatherData weatherData = new WeatherData();
		// 注册两个第三方平台-订阅者
		Observer baiduWeather = new BaiduWeather();
		Observer sinaWeather = new SinaWeather();
		weatherData.registerObserver(baiduWeather);
		weatherData.registerObserver(sinaWeather);

		// 自更新及通知更新
		weatherData.setMeasurements(30.0f, 150.0f, 40.0f);
		weatherData.measurementsChanged();
		// 第三方平台展示数据
		baiduWeather.display();
		sinaWeather.display();
		// 梅开二度
		weatherData.setMeasurements(32.0f, 160.0f, 20.0f);
		weatherData.measurementsChanged();
		baiduWeather.display();
		sinaWeather.display();

		// 注销
		weatherData.removeObserver(sinaWeather);
		weatherData.removeObserver(baiduWeather);
	}
}
