package com.Automationscripts_Fiducia;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Sales.Fiducia.ObjectRepo.LoginPage;
import com.Sales.Fiducia.ObjectRepo.PosUserPage;

import com_Tyss_Fiducia_GenericUtility.BaseClass;
import com_Tyss_Fiducia_GenericUtility.ExcelUtility;
import com_Tyss_Fiducia_GenericUtility.FileUtility;
import com_Tyss_Fiducia_GenericUtility.JavaUtility;
import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class Generate_bill_user_test extends BaseClass{
	@Test
	public void User_billing() throws IOException, AWTException, InterruptedException {
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
			 PosUserPage po=new PosUserPage(driver);
			 po.setUser();
			 Thread.sleep(3000);
			 po.selectcCustomerByUser(wbu,"a z");
			 Thread.sleep(3000);
			 po.setPOS1();
			 Thread.sleep(3000);
			 po.setPOS2("1300");
			/* driver.findElement(By.xpath("//span[text()='POS']")).click();
			 driver.findElement(By.xpath("//a[text()='Headset']")).click();
			 driver.findElement(By.xpath("//h6[text()='airdopes']/parent::div[@class='products']/descendant::input[@type='submit']")).click();
			 Thread.sleep(3000);
			 WebElement wb = driver.findElement(By.xpath("//select[@name='customer']"));
				Select s=new Select(wb);
				s.selectByVisibleText("a z");
				driver.findElement(By.xpath("//button[text()='SUBMIT']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='txtNumber']")).sendKeys("1300");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[.='PROCEED TO PAYMENT']")).click();	*/
				driver.switchTo().alert().accept();
				Set<String> wid = driver.getWindowHandles();
				for(String str:wid) {
					driver.switchTo().window(str);
					String text = driver.getTitle();
					if(text.contains("Inventory ")) {
						System.out.println("transaction is successful");
					}
					else {
						System.out.println("transaction is not successful");
					}
				}
				
}
	}

