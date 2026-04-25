// pages/LoginPage.java

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.xpath("//input[@id=\"email\"]");
    By password = By.xpath("//input[@id=\"password\"]");
    By loginButton = By.cssSelector("button[type=\"submit\"]");

    public void login(String userEmail, String userPassword) {
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(loginButton).click();
    }

    public void clickLoginOnly() {
        driver.findElement(loginButton).click();
    }

    public String getEmailValidationMessage() {
        return driver.findElement(email)
                .getAttribute("validationMessage");
    }
}