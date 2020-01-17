import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DescriptionCheck {
    @Test
    public void firstClass () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://misteram.com.ua/chernigov/oxy");
        driver.findElement(By.xpath("//div[@class='name fade two-lines']//span[@class='ui border-underline dashed ng-binding'][contains(text(),'(40')]")).click();

        driver.findElement(By.xpath("//span[@class='ui border-underline dashed ng-binding'][contains(text(),'\" (40')]")).click();

        driver.findElement(By.xpath("//body/div[@class='container ng-scope']/section[@class='clear clear-saas']/div[@class='content']" +
                "/div[@class='card-wrapper']/div[@class='card-holder clearfix']/div[@class='card-tiny']/div[3]/div[3]/div[2]/span[1]")).click();
    }
}
