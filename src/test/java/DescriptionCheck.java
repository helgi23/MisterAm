import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DescriptionCheck extends WebDriverSettings{

    @Test
    public void firstClass () throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://misteram.com.ua/chernigov/oxy");
        driver.findElement(By.xpath("//div[@class='name fade two-lines']//span[@class='ui border-underline dashed ng-binding'][contains(text(),'(40')]")).click();

        assertEquals("Роли Філадельфія, Каліфорнія, Аляска та Ніагара з лососем та Лас Веган. До кожного ролу додаються палички, соєвий соус, імбир та васабі.",
                driver.findElement(By.xpath("//div[@class='desc ng-binding']")).getText());

    }

}
