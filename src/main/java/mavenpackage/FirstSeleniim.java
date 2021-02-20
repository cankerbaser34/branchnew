package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniim {

  public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://login.salesforce.com");

    driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("name");

    driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("location");

    driver.findElement(By.name("Login")).click();

    driver.findElement(By.name("gr")).click();
    Thread.sleep(3000);

    // driver.quit();
  }

}