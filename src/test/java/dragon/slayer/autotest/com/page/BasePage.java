package dragon.slayer.autotest.com.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Component
public class BasePage implements Page {

    private final Map<String, SelenideElement> elements = new HashMap<>() {{

    }};
}
