package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.JobsTutByStartingPage;
import pages.SearchingPageLoaded;

import static com.codeborne.selenide.Selenide.$;

public class FindJuniorAQA {

    JobsTutByStartingPage startPage = new JobsTutByStartingPage();
    SearchingPageLoaded loadedPage = new SearchingPageLoaded();

    @Test
    public void startFindVacancy(){
        startPage.openStartingPage();
        startPage.writeSomeVacancy("Junior automation");
        startPage.clickSearchButton();
        loadedPage.resultListContains();
    }

}
