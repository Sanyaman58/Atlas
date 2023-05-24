package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseClass extends Utilities {
	public static String browser;
	public static String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";

	public static WebDriver initConfiguration() {
		WebDriver localD = null;
		browser = "chrome";
		System.out.println("Browser: " + browser);

		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("User Dir : " + System.getProperty("user.dir"));

		if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
			browser = System.getenv("browser");
			System.out.println("Browser: " + browser);
		} else {
			browser = PropertiesReader.getPropertyValue("browser");
			System.out.println("Browser: " + browser);
		}

		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "gecko.exe");
			localD = new FirefoxDriver();
//			log.debug("Firefox Driver initialized");
		} else if (browser.equals("chrome")) {


			WebDriverManager.chromedriver().setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("download.default_directory", System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+"ExcelFile");
			prefs.put("profile.password_manager_enabled", false);
			//prefs.put("download.default_directory","C:\\testdirectory");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36";
			options.addArguments("--user-agent=" + agentString);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			options.addArguments("window-size=1920,1080");
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox");
//			Configuration.proxyEnabled=true;
//			Configuration.fileDownload= FileDownloadMode.PROXY;
//			Configuration.downloadsFolder="C:\\testdirectory";
			//options.addArguments("--headless");

			try {
				localD = new ChromeDriver(options);
			} catch (Exception e) {
				e.printStackTrace();
			}
			localD.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			localD.manage().window().maximize();
//			log.debug("Chrome driver intialized");
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			localD = new InternetExplorerDriver();
		}
		localD.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);
		return localD;
	}

	public void CloseBrowser(WebDriver driver) {
		driver.close();
	}

	public void QuitBrowser(WebDriver driver) {
		driver.quit();
	}

	public void goBack(WebDriver driver) {
		driver.navigate().back();
	}

	public WebDriver getDriver() {
		return initConfiguration();
	}

	public static boolean isClickable(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	public String randomNumberString(int len) {
		String AB = "123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
	
	public Object[][] getData(String filename, String SheetName) {
		ExcelReader excel;
		if (System.getProperty("os.name").contains("Windows")) {
			 excel = new ExcelReader(
						System.getProperty("user.dir") + "\\src\\test\\resources\\data\\ExcelFile\\" + filename);
		}else {
			excel = new ExcelReader(
				System.getProperty("user.dir") + "/src/test/resources/data/" + filename + ".xlsx");
		}
		int rows = excel.getRowCount(SheetName);
		int columns = excel.getColumnCountAtRow(SheetName,1);
		System.out.println("Rows: "+rows+"\nColumns:"+columns);
		Object[][] data = new Object[rows - 1][columns];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < columns; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
			}
		}
		return data;
	}
}
