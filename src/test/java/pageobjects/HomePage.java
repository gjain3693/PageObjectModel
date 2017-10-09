package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	

	public static WebDriver driver;
	
	public static WebElement SIGN_IN = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[4]/a/strong"));
	public static WebElement FEEDBACK = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[3]/a"));
	public static WebElement STOCKS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[2]/a"));

	public static WebElement SEARCH_TXT_BOX = driver.findElement(By.xpath("//*[@id='search_str']"));
}
