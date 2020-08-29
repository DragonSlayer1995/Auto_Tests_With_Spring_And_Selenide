package dragon.slayer.autotest.com.service;

import dragon.slayer.autotest.com.page.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePageService {

    @Autowired
    private BasePage basePage;

    public void printHelloInConsole() {
        System.out.println("Hello");
    }
}
