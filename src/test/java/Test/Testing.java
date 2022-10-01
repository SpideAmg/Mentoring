package Test;

import base.SetUpApi;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class Testing extends SetUpApi {


    @Test
    public void test1() {
    //    driver.manage().deleteAllCookies();
        wait(2);

        driver.findElement(By.xpath("//div[@aria-label='Accept Cookies'][@role='button']")).click();
        wait(2);

    }


    @Test
    public void sendTextKey() throws InterruptedException {
        wait(2);
        driver.findElement(By.xpath("//div[@aria-label='Accept Cookies'][@role='button']")).click();
        wait(2);
        driver.findElement(By.xpath("//button[@id='searchButton'][@aria-haspopup='true']")).click();
        wait(2);
        driver.findElement(By.xpath("//input[@name='search'][@type='text']")).sendKeys("Graphic card", Keys.ENTER);
        wait(2);
    }


    @Test
    public void WindowHandle() throws InterruptedException {

     String window1 = driver.getWindowHandle();
        wait(2);
        driver.findElement(By.xpath("//div[@aria-label='Accept Cookies'][@role='button']")).click();
        wait(2);
        driver.findElement(By.xpath("//button[@id='searchButton'][@aria-haspopup='true']")).click();
        wait(2);
        driver.findElement(By.xpath("//input[@name='search'][@type='text']")).sendKeys("Keyboard");
        wait(2);
     driver.findElement(By.xpath("//a[contains(text(),'ROG Strix Scope RX TKL Wireless Deluxe')]")).click();
//     driver.findElement(By.xpath("//input[@name='search'][@type='text']")).sendKeys(Keys.ENTER);
        wait(2);
     Set<String> handlewind = driver.getWindowHandles();
     for (String window2 : handlewind) {
      if (!window2.equals(window1)) {
       driver.switchTo().window(window2);
      }
     }
        wait(2);
     driver.findElement(By.xpath(" //div[@class='ButtonRed__inner__2GkGv']")).click();

        wait(2);

    }
    @Test
    public void selectFromDropDown() {
        wait(2);
        driver.findElement(By.xpath("//div[@aria-label='Accept Cookies'][@role='button']")).click();
        wait(2);
        driver.findElement(By.xpath("//span[contains(text(),'Laptops')]")).click();
        wait(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollTo = driver.findElement(By.xpath("//button[@type='button'][@aria-label='Click to filter Series']"));
        js.executeScript("arguments[0].scrollIntoView(true);", scrollTo);
        wait(2);
        driver.findElement(By.xpath("//button[@type='button'][@aria-label='Click to filter Series']")).click();
        wait(2);


        wait(2);
        SoftAssert soft = new SoftAssert();
        soft.assertAll();


    }



}
