package tests;

import org.testng.annotations.Test;
import pages.JobsTutByStartingPage;
import pages.SearchingPageLoaded;
import pages.VacancyInformationPage;

public class FindJuniorAQA {

    JobsTutByStartingPage startPage = new JobsTutByStartingPage();
    SearchingPageLoaded loadedPage = new SearchingPageLoaded();
    VacancyInformationPage contact = new VacancyInformationPage();

    @Test
    public void startFindVacancy(){
        startPage.openStartingPage();
        startPage.writeSomeVacancy("Junior automation");
        startPage.clickSearchButton();
        loadedPage.resultListContains();
        loadedPage.a1qaFound(" a1qa");
        contact.contactsVerify();
    }

}
