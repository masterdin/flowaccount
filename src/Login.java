import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {

    public void Input_Login(WebDriver driver)  {
      //  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");


        String url = "http://www.flowaccount.com";

        driver.get(url);


        driver.findElement(By.partialLinkText("เข้าสู่ระบบ")).click();

        driver.findElement(By.id("UserName")).sendKeys("testemail@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("fortestonly");

        driver.findElement(By.className("form-group")).submit();
    }



}
