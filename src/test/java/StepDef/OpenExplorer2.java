package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenExplorer2 {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("User access youtube music {string}")
    public void userAccessYoutubeMusic(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("User click explorer button")
    public void userClickExplorerButton() {
        driver.findElement(By.xpath("//ytmusic-pivot-bar-item-renderer[@tab-id='FEmusic_explore']")).click();

    }

    @Then("User direct to explorer page")
    public void userDirectToExplorerPage() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='ytmusic-shelf style-scope ytmusic-carousel-shelf-renderer']")).isDisplayed());
        driver.close();
        driver.quit();

    }
}
