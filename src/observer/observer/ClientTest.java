package observer.observer;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testWeather() {
		// 创建被观察者
		WeatherData weatherData = new WeatherData();
		// 注册两个第三方平台
		IObserver baiduWeather = new BaiduWeather();
		IObserver sinaWeather = new SinaWeather();
		weatherData.registerObserver(baiduWeather);
		weatherData.registerObserver(sinaWeather);
		// 更新及同步数据
		weatherData.updateInnerData(30.0f, 150.0f, 40.0f);
		// 第三方平台展示数据
		baiduWeather.display();
		sinaWeather.display();
		// 更新及同步数据
		weatherData.updateInnerData(32.0f, 160.0f, 20.0f);
		// 第三方平台展示数据
		baiduWeather.display();
		sinaWeather.display();
	}

}
