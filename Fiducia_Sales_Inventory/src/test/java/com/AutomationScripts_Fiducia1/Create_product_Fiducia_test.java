package com.AutomationScripts_Fiducia1;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Sales.Fiducia.ObjectRepo.AddProductPage;
import com.Sales.Fiducia.ObjectRepo.HomePage;
import com.Sales.Fiducia.ObjectRepo.LoginPage;
import com.Sales.Fiducia.ObjectRepo.ProductPage;

import com_Tyss_Fiducia_GenericUtility.BaseClass;
import com_Tyss_Fiducia_GenericUtility.ExcelUtility;
import com_Tyss_Fiducia_GenericUtility.FileUtility;
import com_Tyss_Fiducia_GenericUtility.JavaUtility;
import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;
 
public class Create_product_Fiducia_test extends BaseClass {
@Test
public void create_product() throws IOException, AWTException, InterruptedException {
//	FileUtility fu=new FileUtility();
//	ExcelUtility eu=new ExcelUtility();
//	JavaUtility ju=new JavaUtility();
//	WebDriverUtility wbu=new WebDriverUtility();
//	WebDriver driver;
//	String browser =fu.readTheDataFromPropertyFile("browser");
//	String url = fu.readTheDataFromPropertyFile("url");
//	String username = fu.readTheDataFromPropertyFile("username");
//	String password = fu.readTheDataFromPropertyFile("password");
//	if(browser.equalsIgnoreCase("chrome")) {
//		driver=new ChromeDriver();
//		wbu.waitForPageLoad(driver, 10);
//		wbu.maximizeWindow(driver);
//		driver.get(url);
//	LoginPage l = new LoginPage(driver);
//	l.setLogin(username, password);
		wbu.acceptAlert(driver);
		 Thread.sleep(3000);
		 HomePage h=new HomePage(driver);
		 h.clickPrd();
		 ProductPage p=new ProductPage(driver);
		 p.addPrd();
		 String win = driver.getWindowHandle();
		 driver.switchTo().window(win);
	FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\projectfile.xlsx");
		Workbook sh = WorkbookFactory.create(fi);
		String Prd1 = eu.readDataFromExcelFile("Create_product", 1, 0);
		 String name1 = eu.readDataFromExcelFile("Create_product", 1, 1);
		 String dsc1 = eu.readDataFromExcelFile("Create_product", 1, 2);
	     String qnty1 = eu.readDataFromExcelFile("Create_product", 1, 3);
		 String onhnd1 = eu.readDataFromExcelFile("Create_product", 1, 4);
		 String pric1 = eu.readDataFromExcelFile("Create_product", 1, 5);
			AddProductPage ad=new AddProductPage(driver);
			p.selectcCategory(wbu,"Others");
			p.supplier(wbu,"chroma");
		   ad.setPrd(Prd1,name1,dsc1, qnty1,onhnd1 ,pric1 ,"20-03-2024" );
		   Thread.sleep(3000);
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).sendKeys("20-03-2024");*/
		//ad.clickSave();
		Thread.sleep(3000);
		p.enterProduct();
		List<WebElement> expdata = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td[text()='P00123']"));
		 for(WebElement e:expdata) {
			 String text = e.getText();
			 if(text.contains(Prd1)) {
				 System.out.println("product created");
				 break;
			 }
			 else {
				 System.out.println("not created");
			 }
		 }
		
}
}

