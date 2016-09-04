//package Cases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
///**
// * Created by Administrator on 2016/7/11.
// */
//public class LoginTest {
//    @Test
//    public void loginTest() throws IOException {
//        // 设置 chrome 的路径
//        System.setProperty("webdriver.chrome.driver",ClassLoader.getSystemResource("drivers/chromedriver.exe").getFile());
//        // 创建一个 ChromeDriver 的接口，用于连接 Chrome
//        ChromeDriverService service = new ChromeDriverService.Builder().usingAnyFreePort().build();
//        service.start();
//
//        //创建一个浏览器实例
//        WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
//        driver.get("http://yun.baidu.com");
//        driver.manage().window().maximize();
////        WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/div[1]/form"));
////        driver.switchTo().frame("TANGRAM__PSP_4__form");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/div[1]/form/p[5]/input")).clear();
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/div[1]/form/p[5]/input")).sendKeys("18600571830");
//        driver.findElement(By.id("TANGRAM__PSP_4__password")).clear();
//        driver.findElement(By.id("TANGRAM__PSP_4__password")).sendKeys("fang19881201@");
//        driver.findElement(By.id("TANGRAM__PSP_4__submit")).click();
//
////        driver.close();
//
//
//
//
//
//
//    }
//}
