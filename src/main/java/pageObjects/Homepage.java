package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    private WebDriver driver;

    private By sign_in = By.xpath("//*[@class='theme-btn']");
    private By homepage_courses_title = By.xpath("//*[@class='container']//h2[contains(text(), 'Featured Courses')]");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(sign_in);

    }

    public WebElement getHomepage_courses_title() {
        return driver.findElement(homepage_courses_title);

    }
}
