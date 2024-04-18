package TestNG;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Sales.Fiducia.ObjectRepo.InventoryPage;
import com.Sales.Fiducia.ObjectRepo.PosPage;
import com.Sales.Fiducia.ObjectRepo.PosUserPage;
import com_Tyss_Fiducia_GenericUtility.BaseClass;


@Listeners(com_Tyss_Fiducia_GenericUtility.ListenerImplementation.class)
public class sampleTest extends BaseClass {
	@Test(retryAnalyzer =com_Tyss_Fiducia_GenericUtility.ReTryImplementationClass.class )
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
			/*driver.findElement(By.xpath("//button[.='SUBMIT']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='txtNumber']")).sendKeys("1300");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[.='PROCEED TO PAYMENT']")).click();*/
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			al.accept();
			if(text.equalsIgnoreCase("success.")) {
				System.out.println("transaction is successful");
			}
			else {
				System.out.println("transaction is not successful");
			}
			// r.keyPress(KeyEvent.VK_ENTER);
			// r.keyRelease(KeyEvent.VK_ENTER);
		
}
	
		@Test
		public void User_billing() throws IOException, AWTException, InterruptedException {
//			FileUtility fu=new FileUtility();
//			ExcelUtility eu=new ExcelUtility();
//			JavaUtility ju=new JavaUtility();
//			WebDriverUtility wbu=new WebDriverUtility();
//			WebDriver driver;
//			String browser =fu.readTheDataFromPropertyFile("browser");
//			String url = fu.readTheDataFromPropertyFile("url");
//			String username = fu.readTheDataFromPropertyFile("username");
//			String password = fu.readTheDataFromPropertyFile("password");
//			if(browser.equalsIgnoreCase("chrome")) {
//				driver=new ChromeDriver();
//				wbu.waitForPageLoad(driver, 10);
//				wbu.maximizeWindow(driver);
//				driver.get(url);
//			LoginPage l = new LoginPage(driver);
//			l.setLogin(username, password);
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
					Assert.fail();
				
					
	}
	@Test
	public void UpdateInventory() throws IOException, AWTException, InterruptedException {
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
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			al.accept();
			
			if(text.equals("You've Update Product Successfully.")) {
				System.out.println("updated inventory successfully");
			}
			else {
				System.out.println("not updated");
			}
		
	}
	
	}

