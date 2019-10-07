package pages;

import org.openqa.selenium.By;
import other.DriverStart;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JobsTutByStartingPage extends DriverStart {

    private static final String URL = "https://jobs.tut.by/";

    public void openStartingPage(){
        open(URL);
    }

    public void writeSomeVacancy(String vacancyName){
        $(By.xpath("//*[@class = 'supernova-search-group__input']//input")).sendKeys(vacancyName);
    }

    public void clickSearchButton(){
        $(By.className("supernova-search-submit-text")).click();
    }
}
