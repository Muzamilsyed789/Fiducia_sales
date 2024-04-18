package com.Automationscripts_Fiducia;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sales.Fiducia.ObjectRepo.LoginPage;
import com.Sales.Fiducia.ObjectRepo.PosPage;

import com_Tyss_Fiducia_GenericUtility.BaseClass;
import com_Tyss_Fiducia_GenericUtility.ExcelUtility;
import com_Tyss_Fiducia_GenericUtility.FileUtility;
import com_Tyss_Fiducia_GenericUtility.JavaUtility;
import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class Generate_bill_admin_fiducia_test extends BaseClass{
	@Test
	public void Admin_billing() throws IOException, AWTException, InterruptedException {
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
			 Thread.sleep(3000);
			 PosPage po=new PosPage(driver);
			 po.setPOS();
			 po.selectcCustomer(wbu,"a z");
			 Thread.sleep(3000);
			/* driver.findElement(By.xpath("//span[text()='POS']")).click();
			driver.findElement(By.xpath("//a[text()='Headset']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//h6[.='airdopes']/parent::div//descendant::input[@class='btn btn-info']")).click();
			Thread.sleep(3000);
			/*WebElement wb = driver.findElement(By.xpath("//select[@name='customer']"));
			Select s=new Select(wb);
			s.selectByVisibleText("a z");*/
			 po.setPOS1();
			 Thread.sleep(3000);
			 po.setPOS2("1300");
			 Assert.fail();
			/*driver.findElement(By.xpath("//button[.='SUBMIT']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='txtNumber']")).sendKeys("1300");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[.='PROCEED TO PAYMENT']")).click();*/
			String text = driver.switchTo().alert().getText();
			if(text.equalsIgnoreCase("success.")) {
				System.out.println("transaction is successful");
			}
			else {
				System.out.println("transaction is not successful");
			}
			// r.keyPress(KeyEvent.VK_ENTER);
			// r.keyRelease(KeyEvent.VK_ENTER);
}
	
}
