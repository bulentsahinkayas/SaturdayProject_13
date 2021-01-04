package Project_13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Part_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",MyConstant.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys("Automation");
        driver.findElement(By.id("userEmail")).sendKeys("Testing@gmail.com");
        driver.findElements(By.id("currentAddress")).get(0).sendKeys("Testing Current Address");
//        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address");
        driver.findElements(By.id("permanentAddress")).get(0).sendKeys("Testing Permanent Address");
        driver.findElement(By.id("submit")).click();

        String name = driver.findElement(By.id("name")).getText();
        System.out.println(name);
        String email = driver.findElement(By.id("email")).getText();
        System.out.println(email);
        String currentAddress = driver.findElements(By.id("currentAddress")).get(1).getText();
        System.out.println(currentAddress);
        String permanentAddress = driver.findElements(By.id("permanentAddress")).get(1).getText();
        System.out.println(permanentAddress);

        driver.quit();
    }
}
/*

        1) Navigate to  http://demoqa.com/text-box

        2) Maximize the window

        3) Enter full name as "Automation"

        4) Enter Email as "Testing@gmail.com"

        5) Enter Current Address as "Testing Current Address"

        6) Enter Permanent Address as "Testing Permanent Address"

        7) Click on submit button

        8) Print Name in the text box

        9) Print Email in the text box

        10) Print Current Address in the text box

        11) Print Permanent Address in the text box
 */