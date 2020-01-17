import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {
    @Test
    public void lincCheck() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://misteram.com.ua/chernigov/oxy");

        driver.findElement(By.xpath("//div[@class='card-wrapper']//div[1]//div[4]//div[2]//div[2]//i[1]")).click();
        driver.findElement(By.xpath("//div[@class='meals-btn']//a//button")).click();


        driver.findElement(By.xpath("//div[@class='button-order']//span")).click();
        Thread.sleep(3000L);

        driver.findElement(By.name("address")).sendKeys("Шевченко");
        driver.findElement(By.name("house")).sendKeys("23");
        driver.findElement(By.name("flat")).sendKeys("2");
        driver.findElement(By.name("name")).sendKeys("Ivanov Ivan");
        driver.findElement(By.name("phone")).sendKeys("38098464413");
        driver.findElement(By.id("submitCheckForm")).click();


    }
}
