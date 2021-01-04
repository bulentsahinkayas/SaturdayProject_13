package Project_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",MyConstant.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

        //1
        driver.get("https://www.snapdeal.com/");
        //2
        driver.manage().window().maximize();
        //3
        driver.findElement(By.id("inputValEnter")).sendKeys("teddy bear");
        driver.findElements(By.cssSelector("button span")).get(0).click();
        //4
        WebElement element = driver.findElements(By.cssSelector("#searchMessageContainer div span")).get(0);
        String valElement = element.getText();
        System.out.println(valElement);
        //5
        System.out.println(driver.getCurrentUrl());
        //6
        driver.findElement(By.cssSelector("a.notIeLogoHeader > img")).click();

        //7
        System.out.println(driver.getCurrentUrl());
        //8
        driver.navigate().back();
        element = driver.findElement(By.id("inputValEnter"));
        String text = element.getAttribute("value");
        System.out.println(text);



        driver.quit();
    }
}
    /*

        1) Navigate to https://www.snapdeal.com/

        2) Maximize the window

        3) Search for "teddy bear" and click on search button

        4) Get and print the following text -->> We've got .... results for 'teddy bear'

        5) Print the URL

        6) Click on logo snepdeal logo

        7) Print the URL

        8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
           (Hint: You may use the "value" attribute of the input tag for the search bar)

     */