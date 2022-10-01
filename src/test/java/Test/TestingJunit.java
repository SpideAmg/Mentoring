package Test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestingJunit {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\FORME\\Mentoring\\chromedrive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rog.asus.com/us/");
        String title = driver.getTitle();
        Assert.assertEquals("ROG - Republic of Gamers｜USA | The Choice of Champions", title);
       // String pageSource = driver.getPageSource();
      //  System.out.println(pageSource);
    }


    @AfterMethod
    public void Close(){
        driver.close();
    }


    public void wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    @Test
    public void test1(){

        driver.findElement(By.xpath("//div[@aria-label='Accept Cookies'][@role='button']")).click();
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file

//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//        //Move image file to new destination
//
//        File DestFile=new File(fileWithPath);
//
//        //Copy file at destination
//
//        FileUtils.copyFile(SrcFile, DestFile);


    }
    public void dropDown(){

    }

}
