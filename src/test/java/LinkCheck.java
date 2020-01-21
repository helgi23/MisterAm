import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class LinkCheck extends WebDriverSettings{
    @Test
    public void lincCheck() throws InterruptedException {


        driver.manage().window().maximize();
        driver.get("https://misteram.com.ua/chernigov/oxy");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement linkCheck=driver.findElement(By.cssSelector("body > div.container.ng-scope > section > div.content > div.footer__seo-text"));

        System.out.println(linkCheck.findElements(By.tagName("a")).size());

        WebElement links =linkCheck.findElement(By.xpath("//div[@class='footer-menu footer-widescreen']"));
        System.out.println(links.findElements(By.tagName("a")).size());

        for(int i=1;i<links.findElements(By.tagName("a")).size();i++)
        {
            String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
            links.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000L);
        }

        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();

        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        Thread.sleep(2000L);
        driver.quit();
    }

}



