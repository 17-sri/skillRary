package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.Indexpage;
import pageObjects.Loginpage;

public class Baseclass {
	public WebDriver driver;
	public Logger logger; // log4j2
	public Properties properties,courseProperties;
	@BeforeClass
	public void setUp() throws IOException {
		driver = new ChromeDriver();
		
		FileReader coursefile = new FileReader(".//src//test//resources//courseconfig.properties");
		courseProperties = new Properties();
		courseProperties.load(coursefile);
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		properties = new Properties();
		properties.load(file);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(properties.getProperty("appURL"));	
	}
	public void login() {
		Indexpage indexPage = new Indexpage(driver);
		indexPage.clickLogin();
		Loginpage loginPage = new Loginpage(driver);
		loginPage.setusername(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("Password"));
		loginPage.clickLoginbtn();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		return (generatedString + "#" + generatedNumber);
	}
	public  String captureScreen(String tName) throws IOException, Exception {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String targetFilePath = System.getProperty("user.dir")+"\\screenshot\\"+tName+"_"+timeStamp+".png";
		File targetFile = new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;	
	}
}