package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By errorMessageBy = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    By logoutBy = By.xpath("//*[@id='logout_sidebar_link']");

String baseURL = "https:www.saucedemo.com";

public LoginPage basePage() {
    driver.get(baseURL);
    return this;
}

public LoginPage login (String username, String password) {
    writeText(usernameBy, username);
    writeText(passwordBy, password);
    click(loginButtonBy);
    return this;
}

public LoginPage verifyInvalidLogin (String expectedText) {
    String errorString = readText(errorMessageBy);
    assertStringEquals(errorString, expectedText);
    return this;
}

public LoginPage verifySucessfullLogout(){
    assertElementVisible(loginButtonBy);
    return this;
}

}
