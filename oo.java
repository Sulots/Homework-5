import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oo {
    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_badge")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("Tester");
        driver.findElement(By.id("postal-code")).sendKeys("59100");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.className("shopping_cart_badge")).click();
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.className("input_error")).isDisplayed();
        driver.findElement(By.className("error-button")).click();
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("Tester");
        driver.findElement(By.id("postal-code")).sendKeys("59100");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Epic sadface: Username is required']")).isDisplayed();
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Epic sadface: Sorry, this user has been locked out.']")).isDisplayed();
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("password")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//*[text()='Price (high to low)']")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("inventory_item_img")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.className("shopping_cart_badge")).click();
        Thread.sleep(5000);
        driver.close();


    }
}
