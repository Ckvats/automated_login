import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class seleniumtest {
    @Test()
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\sql\\selenium_basic\\src\\test\\re\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://demoqa.com/login");
        webDriver.manage().window().maximize();
        String username = "ckvats";     //username
        String password = "Ch@310702";   //password

        //finding the desired id for the login in page
        
        WebElement usernameInput = webDriver.findElement(By.id("userName"));
        WebElement passwordInput = webDriver.findElement(By.id("password"));
        WebElement loginButton = webDriver.findElement(By.id("login"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();



    }
}
