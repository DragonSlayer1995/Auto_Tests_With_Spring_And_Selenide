package dragon.slayer.autotest.com.steps;

import cucumber.api.java.en.Given;
import dragon.slayer.autotest.com.service.BasePageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPageStepDefinitions {
    @Autowired
    private BasePageService basePageService;

    @Given("main page is opened")
    public void inputTextInToSearchField() {
        basePageService.printHelloInConsole();
    }
}
