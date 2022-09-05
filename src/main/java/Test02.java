import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Owner/Seleniumm/ChromeDriver/chromedriver.exe/");


        WebDriver driver =new ChromeDriver();

        driver.get("https://login.yahoo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("createacc")).click();

        Thread.sleep(1000);

        String name = "Burhan";
        driver.findElement(By.name("firstName")).sendKeys(name);
        String lastname="Aslan";
        Thread.sleep(3000);
        driver.findElement(By.name("lastName")).sendKeys(lastname);


}}
