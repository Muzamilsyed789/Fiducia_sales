package com_Tyss_Fiducia_GenericUtility;
import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.Sales.Fiducia.ObjectRepo.HomePage;
import com.Sales.Fiducia.ObjectRepo.LoginPage;
public class BaseClass {
	public  DatabaseUtility db=new DatabaseUtility();
	public FileUtility fu=new FileUtility();
	public ExcelUtility eu=new ExcelUtility();
	public JavaUtility ju=new JavaUtility();
	public 	WebDriverUtility wbu=new WebDriverUtility();
	public static WebDriver driver1;
	public  WebDriver driver;
@BeforeSuite(alwaysRun = true)
public void connectToDB() throws SQLException {
	db.connectionDB();
	System.out.println("connected to db----");
}
/*@BeforeClass(alwaysRun = true)
public void launchBrowser() throws IOException {
	String BROWSER = fu.readTheDataFromPropertyFile("browser");
	
	if(BROWSER.equalsIgnoreCase("chrome")) {
		 driver =new ChromeDriver();
		Reporter.log("--Launch chrome Browser--",true);
	}
	else {
		Reporter.log("-- Invalid Browser--",true);
	}
	wbu.maximizeWindow(driver);
	wbu.waitForPageLoad(driver,5);
}*/
//@Parameters("BROWSER")
@BeforeMethod(alwaysRun = true)
public void loginApp() throws IOException {
	//String BROWSER= fu.readTheDataFromPropertyFile("browser");
	String BROWSER = System.getProperty("browser");
	if(BROWSER.equalsIgnoreCase("chrome")) {
		 driver =new ChromeDriver();
		Reporter.log("--Launch chrome Browser--",true);
	}
	else if (BROWSER.equalsIgnoreCase("firefox")) {
		driver =new FirefoxDriver();
	}
	else if (BROWSER.equalsIgnoreCase("edge")) {
		driver =new EdgeDriver();
	}
	else {
		Reporter.log("-- Invalid Browser--",true);
	}
	driver1=driver;
	wbu.maximizeWindow(driver);
	wbu.waitForPageLoad(driver,5);

	String url = fu.readTheDataFromPropertyFile("url");
	String USERNAME = fu.readTheDataFromPropertyFile("username");
	String PASSWORD = fu.readTheDataFromPropertyFile("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(USERNAME, PASSWORD);
	Reporter.log("-- Logged into application--",true);	
}
  @AfterMethod(alwaysRun = true)
  public void logOutFromApp() {
	  HomePage h=new HomePage(driver);
	  h.logout();
	  Reporter.log("--logout from  application--",true);
	  driver.quit();
		 Reporter.log("--close the browser--",true);
  }
/*@AfterClass(alwaysRun = true)
public void closeBrowser() {
	driver.quit();
	 Reporter.log("--close the browser--",true);	
}*/
}
