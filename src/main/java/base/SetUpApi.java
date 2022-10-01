package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetUpApi {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\FORME\\Mentoring\\chromedrive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rog.asus.com/us/");
//        driver.navigate().to("https://rog.asus.com/us/");
        String title = driver.getTitle();
        Assert.assertEquals("ROG - Republic of Gamers｜USA | The Choice of Champions", title);
    }
    @AfterMethod
    public void Close(){
        driver.close();
    }

    public void wait(int sec){
        try {
            Thread.sleep(sec * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(String locator){
        driver.findElement(By.xpath(locator)).click();
    }


}
