package task_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

    public static void main(String[] args) {
        //Creating a Object for Chrome Driver
        WebDriver driver = new ChromeDriver();
        //Maximizing the Chrome Window
        driver.manage().window().maximize();
        //Passing the URL
        driver.get("https://snapdeal.com/");
        //Creating a Object for Actions Class to do Mouse Operations
        Actions a = new Actions(driver);
        //Finding the "Sign In" Web Element
        WebElement we = driver.findElement(By.xpath("//span[@class=\"accountUserName col-xs-12 reset-padding\"]"));
        //Mouse Hover on it
        a.moveToElement(we).perform();
        //Finding the "Your Account" Web Element and Clicking on it
        driver.findElement(By.xpath("//a[text()='Your Account']")).click();
        //Finding the "Email" Text box Web Element and Sending the Data
        driver.findElement(By.id("userName")).sendKeys("hptamizhan03@gmail.com");
        //Finding the "Continue" Button and Clicking on it
        driver.findElement(By.id("checkUser")).click();

        //Hereafter its asking OTP... We cant automate OTP in Selenium so, I Finish it Here itself
    }
}
