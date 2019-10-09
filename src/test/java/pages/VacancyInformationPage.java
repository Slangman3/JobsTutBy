package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class VacancyInformationPage {
    public void contactsVerify(){
        $(By.xpath("//*[@class='bloko-link-switch'][contains(text(),'Контактная информация')]")).click();
        $$(By.xpath("//*[@class='vacancy-contacts__phone-desktop']")).get(0).shouldBe(Condition.text("+375 (33) 3429063"));
        String blabla = $$(By.xpath("//*[@class='vacancy-contacts__phone-desktop']")).get(0).getText();
        System.out.println(blabla);

    }
}
