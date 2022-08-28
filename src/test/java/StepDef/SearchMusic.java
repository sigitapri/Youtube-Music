package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchMusic {
    WebDriver driver;
    @Given("User open youtube music {string}")
    public void userOpenYoutubeMusic(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("User input keyword {string}")
    public void userInputKeyword(String search) {
        driver.findElement(By.xpath("//tp-yt-iron-icon [@id='icon']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(search);
    }

    @When("User click search")
    public void userClickSearch() {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
    }

    @Then("Youtube music show result of keyword numb")
    public void youtubeMusicShowResultOfKeywordNumb() {
        Assert.assertTrue(driver.findElement(By.xpath("//a [@class='yt-simple-endpoint style-scope yt-formatted-string']")).isDisplayed());
        driver.close();
        driver.quit();

    }
}
