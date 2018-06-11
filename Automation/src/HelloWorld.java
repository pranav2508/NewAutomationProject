
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class HelloWorld {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://mail.google.com/");

        driver.manage().window().maximize();
// Enter UserName
        driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
// Enter Password
        driver.findElement(By.id("Passwd")).sendKeys("YOUR PASSWORD");
// Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
        driver.findElement(By.id("signIn")).click();
//Click on Compose Mail.
        driver.findElement(By.xpath("//div[@class='z0']/div")).click();
// Click on the image icon present in the top right navigational Bar
        driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
//Click on 'Logout' Button
        driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//Close the browser.
        driver.close();
    }}
