package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchingPageLoaded {

    public void resultListContains(){
        $(By.className("resume-search-item__name")).shouldBe(Condition.visible);
    }
}
