import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RegisterUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "H:\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.name("name")).sendKeys("Bhanu");
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("Bhanu@outlook.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.cssSelector("h2 b")).getText();
		Assert.assertEquals(text, "ENTER ACCOUNT INFORMATION");
		WebElement ele = driver.findElement(By.cssSelector("input[name='title']"));
		driver.findElement(with(By.tagName("input")).toRightOf(ele)).click();
	}

}
