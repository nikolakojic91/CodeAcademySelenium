package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    
@Test
public void loginWithValidCredentials() {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage (driver);


    loginPage.basePage();
    loginPage.login(validUsername, validPassword);
    homePage.validateNavigationToPlp("PRODUCTS");
    
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}

@Test
public void loginWithInvalidUsernameAndValidPassword() {
    LoginPage loginPage = new LoginPage(driver);
    
    String invalidUsername = "Nikola";
    loginPage.basePage();
    loginPage.login(invalidUsername,validPassword);
    loginPage.verifyInvalidLogin("Epic sadface: Username and password do not match any user in this service");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
@Test
public void loginWithValidUsernameAndInvalidPassword() {
    LoginPage loginPage = new LoginPage(driver);
    
    String invalidPassword = "Nikola";
    loginPage.basePage();
    loginPage.login(validUsername,invalidPassword);
    loginPage.verifyInvalidLogin("Epic sadface: Username and password do not match any user in this service");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
}
}
@Test
public void verifyLoginWithoutUsername() {
    LoginPage loginPage = new LoginPage(driver);
    
    loginPage.basePage();
    loginPage.login("", validPassword);
    loginPage.verifyInvalidLogin("Epic sadface: Username is required");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
@Test
public void verifyLoginWithoutPassword() {
    LoginPage loginPage = new LoginPage(driver);
    
    loginPage.basePage();
    loginPage.login(validUsername, "");
    loginPage.verifyInvalidLogin("Epic sadface: Password is required");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();

}
}
@Test
public void verifyLoginWithLockedOutUser() {
    LoginPage loginPage = new LoginPage(driver);
    
    
    loginPage.basePage();
    loginPage.login("locked_out_user", "secret_sauce");
    loginPage.verifyInvalidLogin("Epic sadface: Sorry, this user has been locked out.");
    
    try {

        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();

}
}

@Test
public void verifyLogout() {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    
    loginPage.basePage();
    loginPage.login(validUsername, validPassword);
    homePage.clickOnHamburgerMenu();
    homePage.clickOnLogoutLink();
    loginPage.verifySucessfullLogout();
    
    
    try {

        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();

    }

}

}



