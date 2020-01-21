import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Order extends WebDriverSettings {


    @Test
    public void lincCheck() throws InterruptedException {

        driver.manage().window().maximize();

        driver.get("https://misteram.com.ua/chernigov/oxy");

        driver.findElement(By.xpath("//div[@class='card-wrapper']//div[1]//div[4]//div[2]//div[2]//i[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='meals-btn']//a//button")).click();
        driver.findElement(By.xpath("//div[@class='button-order']//span")).click();
        Thread.sleep(3000L);

        driver.findElement(By.name("address")).sendKeys("Шевченко");
        driver.findElement(By.name("house")).sendKeys("23");
        driver.findElement(By.name("flat")).sendKeys("2");
        driver.findElement(By.name("name")).sendKeys("Ivanov Ivan");
        driver.findElement(By.name("phone")).sendKeys("380984644136");
        driver.findElement(By.id("submitCheckForm")).click();

    }
}
