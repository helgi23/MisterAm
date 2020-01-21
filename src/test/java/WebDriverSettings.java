import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","D:\\EclipseWorkspace\\chromedriver.exe");
        System.out.println("Test start");
        driver = new ChromeDriver();
}

    @AfterClass
    public void closeUp() throws InterruptedException {
        Thread.sleep(5000L);
        System.out.println("Test close");
        driver.quit();
    }

}
