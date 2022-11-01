package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By headerTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By hamburgerIconBy = By.id("react-burger-menu-btn");
    By logoutLinkBy = By.id("logout_sidebar_link");
    By firstProductOnListBy = By.xpath("//*[@id='item_4_title_link']/div");
    By allItemsBy = By.id("inventory_sidebar_link");
    By aboutBy = By.id("about_sidebar_link");
    By cartIconBy = By.id("add-to-cart-sauce-labs-backpack");
    By sortDropdownBy = By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select");
    By productTitlesBy = By.xpath("//div[@class='inventory_item_name']");
    By productTitlePriceBy = By.xpath("//div[@class='inventory_item_price']");


    public HomePage validateNavigationToPlp (String expectedText) {
        String pageTitle = readText(headerTitleBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }

   public HomePage clickOnHamburgerMenu () {
    click(hamburgerIconBy);
    return this;
   }

   public HomePage clickOnLogoutLink () {
    click(logoutLinkBy);
    return this;
   }

   public HomePage clickOnFirstProductOnList () {
    click(firstProductOnListBy);
    return this;
}
public HomePage clickOnAllItems () {
    click(allItemsBy);
    return this;

}

public void validateAboutHref (String expectedLink) {
    assertStringEquals(readHref(aboutBy), expectedLink);
   
}
public HomePage clickOnCartIcon () {
    click (cartIconBy);
    return this;
}


public HomePage selectSortOptionByValue(String value) {
    selectDropdownOptionByValue(sortDropdownBy, value);
    return this;
}
public HomePage validateFirstProductName(String expectedName) {

    String firstProductTitle = readTextFromIndexElement(productTitlesBy, 0);
    assertStringEquals(firstProductTitle, expectedName);
    return this;
}
public HomePage validateFirstProductPrice(String expectedPrice) {

    String firstProductPrice = readTextFromIndexElement(productTitlePriceBy, 0);
    assertStringEquals(firstProductPrice, expectedPrice);
    return this;


}}





