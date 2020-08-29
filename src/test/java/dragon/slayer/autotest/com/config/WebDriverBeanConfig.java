package dragon.slayer.autotest.com.config;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;

@Configuration
@ComponentScan("dragon.slayer.autotest.com")
@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
public class WebDriverBeanConfig {

    @Qualifier("chrome")
    @Bean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        return WebDriverRunner.getWebDriver();
    }
}
