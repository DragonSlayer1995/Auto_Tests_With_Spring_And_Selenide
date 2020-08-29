package dragon.slayer.autotest.com.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dragon.slayer.autotest.com.config.PropertiesConfig;
import dragon.slayer.autotest.com.config.WebDriverBeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selenide.open;

@ContextConfiguration(classes = {WebDriverBeanConfig.class})
public class Hook {

    @Autowired
    private PropertiesConfig config;

    @Before
    public void before() {
        open(config.getWeb().getBaseurl());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @After
    public void after() {
        WebDriverRunner.clearBrowserCache();
    }
}
