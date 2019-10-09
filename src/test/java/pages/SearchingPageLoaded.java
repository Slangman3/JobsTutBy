package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchingPageLoaded {

    public void resultListContains(){
        $(By.className("resume-search-item__name")).shouldBe(Condition.visible);
    }

    public void a1qaFound(String vacancy){
        $(By.xpath(String.format("//*[@class='vacancy-serp-item__meta-info']/*[contains(text(), '%s')]", vacancy))).shouldBe(Condition.visible).click();
        $(By.xpath("//*[@class='bloko-link HH-LinkModifier'][contains(text(), 'Специалист по автоматизации тестирования / Junior QA Automation Engineer')]")).shouldBe(Condition.visible).click();
    }
}
