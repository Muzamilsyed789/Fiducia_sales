package com.Automationscripts_Fiducia;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Sales.Fiducia.ObjectRepo.InventoryPage;
import com.Sales.Fiducia.ObjectRepo.LoginPage;

import com_Tyss_Fiducia_GenericUtility.BaseClass;
import com_Tyss_Fiducia_GenericUtility.ExcelUtility;
import com_Tyss_Fiducia_GenericUtility.FileUtility;
import com_Tyss_Fiducia_GenericUtility.JavaUtility;
import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class Update_quantity_inventory_test extends BaseClass{
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
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.manage().window().maximize();
			//driver.get(url);
			//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
			//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			//Robot r = new Robot();
			// r.keyPress(KeyEvent.VK_ENTER);
			// r.keyRelease(KeyEvent.VK_ENTER);
			InventoryPage i=new InventoryPage(driver);
			i.setInventory("007", "2"," 1");
			 Thread.sleep(3000);
			/* driver.findElement(By.xpath("//span[text()='Inventory']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='search']")).click();*/
			Thread.sleep(3000);
			/*driver.findElement(By.xpath("//input[@type='search']")).sendKeys("007");
			driver.findElement(By.xpath("//td[text()='airdopes']/ancestor::tr[@role='row']/descendant::td[@align='right']")).click();
			driver.findElement(By.xpath("(//a[@class='btn btn-warning bg-gradient-warning'])[1]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Quantity']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("2");
			driver.findElement(By.xpath("//input[@placeholder='On Hand']")).click();
			driver.findElement(By.xpath("//input[@placeholder='On Hand']")).sendKeys("0");
			driver.findElement(By.xpath("//i[@class='fa fa-edit fa-fw']")).click();*/
			//driver.switchTo().alert().accept();
			//wbu.acceptAlert(driver);
			/*Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);*/
			String text = driver.switchTo().alert().getText();
			if(text.equals("You've Update Product Successfully.")) {
				System.out.println("updated inventory successfully");
			}
			else {
				System.out.println("not updated");
			}
		}
	
}
