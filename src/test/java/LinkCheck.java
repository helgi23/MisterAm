import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class LinkCheck extends WebDriverSettings{

    @Test
    public void firstLink() throws IOException {
        driver.manage().window().maximize();
        driver.get("https://misteram.com.ua/chernigov/promotions");
        String value = ("https://misteram.com.ua/chernigov/promotions");
        URL myurl = new URL(value);
        HttpURLConnection connection = (HttpURLConnection) myurl.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        Assert.assertEquals(code, 200);
    }

    @Test
    public void secondLink() throws IOException {
        driver.get("https://misteram.com.ua/rules");
        String value = ("https://misteram.com.ua/chernigov/promotions");
        URL myurl = new URL(value);
        HttpURLConnection connection = (HttpURLConnection) myurl.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        Assert.assertEquals(code, 200);

    }
    @Test
    public void thirdLink() throws IOException {
        driver.get("https://www.instagram.com/mister.am.chernihiv");
        String value = ("https://www.instagram.com/mister.am.chernihiv");
        URL myurl = new URL(value);
        HttpURLConnection connection = (HttpURLConnection) myurl.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        Assert.assertEquals(code, 200);
    }

    @Test
    public void fourthLink() throws IOException {
        driver.get("https://www.facebook.com/mister.am.chernihiv");
        String value = ("https://www.facebook.com/mister.am.chernihiv");
        URL myurl = new URL(value);
        HttpURLConnection connection = (HttpURLConnection) myurl.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        Assert.assertEquals(code, 200);
    }


}



