import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.junit.Before;

public class WebDriverSettings {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","D:\\EclipseWorkspace\\chromedriver.exe");
        driver =new ChromeDriver();
}

}
