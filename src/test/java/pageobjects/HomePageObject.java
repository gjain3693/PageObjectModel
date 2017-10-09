package pageobjects;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HomePageObject {


	public static WebDriver driver;

	static {

		DesiredCapabilities capabilities;

		String webDriverKey;
		String webDriverPath;

		capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver
				.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver
				.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		capabilities.setCapability("requireWindowFocus", true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		webDriverKey = "webdriver.ie.driver";
		webDriverPath = "F:\\IEDriver\\IEDriverServer.exe";
		System.setProperty(webDriverKey,webDriverPath);
		driver = new InternetExplorerDriver(capabilities);
		System.out.println(driver instanceof InternetExplorerDriver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(
				By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		driver.manage().window().maximize();



	}

	private static WebElement SIGN_IN = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[4]/a/strong"));

	private static WebElement FEEDBACK = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[3]/a"));
	private static WebElement STOCKS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div/div[2]/div[2]/div[2]/a"));

	private static WebElement SEARCH_TXT_BOX = driver.findElement(By.xpath("//*[@id='search_str']"));

	private static WebElement TO_HOME = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/a"));
	private static WebElement TO_NEWS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[2]/a"));
	private static WebElement TO_MARKETS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[3]/a"));
	private static WebElement TO_MUTUAL_FUNDS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[4]/a"));
	private static WebElement TO_COMMODITES = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[5]/a"));
	private static WebElement TO_STARTUPS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[6]/a"));
	private static WebElement TO_OPINION = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[7]/a"));
	private static WebElement TO_PROPERTY = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[8]/a"));
	private static WebElement TO_PERSONAL_FINANCE = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[9]/a"));
	private static WebElement TO_PORTFOLIO = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[10]/a"));
	private static WebElement TO_FORUM = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[11]/a"));
	private static WebElement TO_GALLERY = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[12]/a"));
	private static WebElement TO_LIVE_TV = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[13]/a"));


	private static WebElement TO_SEBI = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[1]/a"));
	private static WebElement TO_NORTH_KOREA = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[2]/a"));
	private static WebElement TO_RESEARCH = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[3]/a"));
	private static WebElement TO_COMPANIES = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[4]/a"));
	private static WebElement TO_ECONOMY = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[5]/a"));
	private static WebElement TO_POLITICS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[6]/a"));
	private static WebElement TO_INTERVIEWS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[7]/a"));
	private static WebElement TO_CRICKET = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[8]/a"));
	private static WebElement TO_WORLD = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[9]/a"));
	private static WebElement TO_ANNOUNCEMENTS = driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[4]/div/div[2]/ul[1]/li[1]/div/ul/li[10]/a"));




}
