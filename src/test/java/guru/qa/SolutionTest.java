package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionTest {

    @Test
    public void checkingPage() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
       $(byText("Solutions")).hover();
       $(byText("Enterprise")).click();
       $("h1.h1-mktg").shouldHave(Condition.text("Build like the best"));
    }
}
