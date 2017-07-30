import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;


public class Create_Quotation {


    public void Create(WebDriver driver) {

    //    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement expand_sale_nav = driver.findElement(By.cssSelector("#sales-nav"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        expand_sale_nav.click();


        WebElement Quotation_click = driver.findElement(By.cssSelector("#sales-nav ul li:nth-child(1)"));
        Quotation_click.click();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement New_Quo = driver.findElement(By.cssSelector("#gridsection div a"));
        New_Quo.click();


        WebElement Input_Cust_Name = driver.findElement(By.id("ClientName"));

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ClientName")));
        Input_Cust_Name.click();
        Input_Cust_Name.sendKeys("Test");


        WebElement Input_Cust_Address = driver.findElement(By.id("ClientAddress"));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("ClientAddress")));
        Input_Cust_Address.click();
        Input_Cust_Address.sendKeys("1234/5678");


        WebElement Item_Add = driver.findElement(By.xpath(".//*[@id='documentForm']/div/section[3]/div[1]/table/tbody/tr[1]/td[3]"));
        Item_Add.click();
        Item_Add.sendKeys("Item1");


        WebElement Item_Price = driver.findElement(By.xpath(".//*[@id='product-item-price-']"));
        Item_Price.sendKeys("10000");


        WebElement Get_Quo_id = driver.findElement(By.cssSelector("#createUpdateModal .pull-right div"));
        System.out.println(Get_Quo_id.getText());


        WebElement Print = driver.findElement(By.xpath(".//*[@id='printbtn']"));
        Print.click();


        WebElement Check_Print = driver.findElement(By.xpath(".//*[@id='app']/div[5]/div/div/div[1]/h3"));

        if (Check_Print.isDisplayed()) {

            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //Close Print Page

        WebElement Close_print = driver.findElement(By.cssSelector(".modal-content div a"));
        Close_print.click();

        //Close Create Quotation Page
        WebElement Close = driver.findElement(By.cssSelector(".close-invoice-create"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".close-invoice-create")));
        Close.click();

        WebElement Get_Quo_id_in_grid = driver.findElement(By.cssSelector("#ui-id-1 .table .bbGrid-row td:nth-child(3)"));
        System.out.println(Get_Quo_id_in_grid.getText());



//        if(Get_Quo_id.getText().equalsIgnoreCase(Get_Quo_id_in_grid.getText())){
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }


//        driver.findElement(By.cssSelector(".button-box")).click();


        //driver.quit();
    }
}