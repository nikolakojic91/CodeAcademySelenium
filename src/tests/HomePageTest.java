package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest {

String expectedProductNameZASort = "Test.allTheThings() T-Shirt (Red)";
String expectedProductNameAZSort = "Sauce Labs Backpack";
String expectedProductPriceLowToHigh = "$7.99";
String expectedProductPriceHighToLow = "$49.99";
    @Test
    public void verifyAbout() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        
        loginPage.basePage();
        loginPage.login(validUsername, validPassword);
        homePage.clickOnHamburgerMenu();
        homePage.validateAboutHref("https://saucelabs.com/");
        
        
        try {
    
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();


        }}

    @Test
    public void checkSortFromZToA() {
        LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            
            loginPage.basePage();
            loginPage.login(validUsername, validPassword);
            homePage.selectSortOptionByValue("za");
            homePage.validateFirstProductName(expectedProductNameZASort);

            try {
    
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

    }
}
    @Test
    public void checkSortFromAToZ() {
        LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            
            loginPage.basePage();
            loginPage.login(validUsername, validPassword);
            homePage.selectSortOptionByValue("za");
            homePage.selectSortOptionByValue("az");
            homePage.validateFirstProductName(expectedProductNameAZSort);

            try {
    
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

}
    }
    @Test
    public void checkSortFromLowToHigh() {
        LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            
            loginPage.basePage();
            loginPage.login(validUsername, validPassword);
            homePage.selectSortOptionByValue("lohi");
            homePage.validateFirstProductPrice(expectedProductPriceLowToHigh);


            try {
    
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();


}
    }
    @Test
    public void checkSortFromHighToLow() {
        LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            
            loginPage.basePage();
            loginPage.login(validUsername, validPassword);
            homePage.selectSortOptionByValue("hilo");
            homePage.validateFirstProductPrice(expectedProductPriceHighToLow);


            try {
    
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();


}
    }}
