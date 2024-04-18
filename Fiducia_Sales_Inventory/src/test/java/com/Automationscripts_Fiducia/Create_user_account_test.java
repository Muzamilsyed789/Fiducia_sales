package com.Automationscripts_Fiducia;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Sales.Fiducia.ObjectRepo.AddUserPage;
import com.Sales.Fiducia.ObjectRepo.HomePage;
import com.Sales.Fiducia.ObjectRepo.LoginPage;
import com_Tyss_Fiducia_GenericUtility.BaseClass;
import com_Tyss_Fiducia_GenericUtility.ExcelUtility;
import com_Tyss_Fiducia_GenericUtility.FileUtility;
import com_Tyss_Fiducia_GenericUtility.JavaUtility;
import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;
public class Create_user_account_test extends BaseClass {
	@Test
	public void createUserAcc() throws IOException, AWTException, InterruptedException {
//		FileUtility fu=new FileUtility();
//		ExcelUtility eu=new ExcelUtility();
//		JavaUtility ju=new JavaUtility();
//		WebDriverUtility wbu=new WebDriverUtility();
//		WebDriver driver;
//		String browser =fu.readTheDataFromPropertyFile("browser");
//		String url = fu.readTheDataFromPropertyFile("url");
//		String username = fu.readTheDataFromPropertyFile("username");
//		String password = fu.readTheDataFromPropertyFile("password");
//		if(browser.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//			wbu.waitForPageLoad(driver, 10);
//			wbu.maximizeWindow(driver);
//			driver.get(url);
//		LoginPage l = new LoginPage(driver);
//		l.setLogin(username, password);
			wbu.acceptAlert(driver);
			HomePage h=new HomePage(driver);
			h.creatAcc();
			h.createUser();
			// driver.findElement(By.xpath("//span[text()='Accounts']")).click();
			//driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
			Thread.sleep(3000);
            driver.findElement(By.xpath("//select[@name='empid']")).click();
            AddUserPage a=new AddUserPage(driver);
            a.selectcEmp(wbu," R, Sinchana - Manager");
            // WebElement sel = driver.findElement(By.xpath("//select[@name='empid']"));
         //  wbu.handleDropDown(sel,"116");
         	//Select s=new Select(sel);
         	//s.selectByValue("116");
            a.setUserAcc("dualip","12345" );
     //   driver.findElement(By.xpath("//div[@class='form-group']//input[@name='username']")).sendKeys("dualipa");
     //   driver.findElement(By.xpath("//div[@class='form-group']//input[@placeholder='Password']")).sendKeys("12345");
     //   driver.findElement(By.xpath("//div[@class='modal fade show']/div/div//button[@type='submit']")).click();
    //  driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
        
        
        a.logout();
        Thread.sleep(3000);
        String win = driver.getWindowHandle();
		 driver.switchTo().window(win);
        a.finalLogout();
       // driver.findElement(By.xpath("//div[@aria-labelledby='userDropdown']/descendant::a[@data-toggle='modal']")).click();
     // driver.findElement(By.xpath("//div[@class='modal-footer']//a[text()='Logout']")).click();
        Thread.sleep(3000);
 	String browser1 =fu.readTheDataFromPropertyFile("browser1");
		String url1 = fu.readTheDataFromPropertyFile("url1");
		String username1 = fu.readTheDataFromPropertyFile("username1");
		String password1 = fu.readTheDataFromPropertyFile("password1");
		if(browser1.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			wbu.waitForPageLoad(driver, 10);
			wbu.maximizeWindow(driver);
			driver.get(url1);
			LoginPage l1=new LoginPage(driver) ;
				l1.setLoginUser(username1, password1);
				 Thread.sleep(3000);
				driver.switchTo().alert().accept();
		}		
	}
}


