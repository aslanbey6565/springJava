package trArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders03 {

            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver","C:/Users/Owner/Seleniumm/ChromeDriver/chromedriver.exe/");


                WebDriver driver =new ChromeDriver();

                driver.get("https://www.amazon.ca/ref=nav_logo");


                driver.manage().window().maximize();

                driver.findElement(By.xpath("//span[text()='Returns']")).click();



    }
}
