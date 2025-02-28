import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulLogin() {
        open("https://www.google.ru");
    
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
