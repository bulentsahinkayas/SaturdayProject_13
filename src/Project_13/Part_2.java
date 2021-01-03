package Project_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",MyConstant.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");
        driver.findElement(By.id("password")).sendKeys("techno123.");
        driver.findElement(By.id("log-in")).click();
        String str = driver.findElement(By.id("time")).getText();
        System.out.println(str);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
 /*
        1) Navigate to https://demo.applitools.com/

        2) Maximize the window

        3) Enter the username as "ttechno@gmail.com"

        4) Enter the password as "techno123."

        5) Click on sign in button

        6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str

        7) Print the String str

        8) Print the URL
     */