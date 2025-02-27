import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulLogin() {
        open("https://www.duckduck.com");
        $("[name=q]").setValue("Selenide").pressEnter();
        //123123
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
