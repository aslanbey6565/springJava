import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Owner/Seleniumm/ChromeDriver/chromedriver.exe/");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.ca/");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella");
        Thread.sleep(1000);
        driver.findElement(By.className("nav-search-submit-text")).click();
        driver.findElement(By.linkText("Oreo")).click();
        Thread.sleep(1000);
        driver.navigate().to("https://www.google.ca/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.quit();

    }
}
