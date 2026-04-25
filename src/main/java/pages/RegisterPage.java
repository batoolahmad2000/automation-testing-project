// pages/RegisterPage.java

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.cssSelector("input[id=\"name\"]");
    By email = By.cssSelector("input[name=\"email\"]");

    By country = By.xpath("//button[@aria-controls=\"radix-_r_ar_\"]");
    By city = By.xpath("//button[@aria-controls=\"radix-_r_as_\"]");
    By gender = By.xpath("//button[@aria-controls=\"radix-_r_ge_\"]");

    By phoneNumber = By.xpath("//input[@placeholder=\"رقم الهاتف\"]");

    By password = By.xpath("//input[@name=\"password\"]");
    By confirmPassword = By.cssSelector("input[id=\"confirm_password\"]");

    By termsCheckbox = By.cssSelector("/button[role=\"checkbox\"]");

    By createAccount = By.xpath(
            "//button[@type=\"submit\"]"
    );
    By login =By.xpath("//a[@href=\"/ar/auth/login\"]");

    public void registerWithoutUsername(
            String userEmail,
            String userCountry,
            String userCity,
            String userGender,
            String userPhone,
            String userPassword
    ) {

        // intentionally skip name

        driver.findElement(email).sendKeys(userEmail);

        new Select(driver.findElement(country))
                .selectByVisibleText(userCountry);

        new Select(driver.findElement(city))
                .selectByVisibleText(userCity);

        new Select(driver.findElement(gender))
                .selectByVisibleText(userGender);

        driver.findElement(phoneNumber).sendKeys(userPhone);

        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(confirmPassword).sendKeys(userPassword);

        driver.findElement(termsCheckbox).click();

        driver.findElement(createAccount).click();
    }
    public void LoginPage() {
        driver.findElement(login).click();
    }

}