import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

    @Test
    void yaSearchTest() {
        open("https://www.ya.ru");
        $("[id=text]").setValue("selenide").pressEnter();
        $("[class=content]").shouldHave(text("ru.selenide.org"));
    }
}
