import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Owner/Seleniumm/ChromeDriver/chromedriver.exe/");


        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.ca/");

        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Java");

        Thread.sleep(3000);

        driver.findElement(By.className("gNO89b")).click();



    }


}
