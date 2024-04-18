package com.Automation_User_Fiducia;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class Generate_Bill_User_Fiducia_Test {
		@Test
		public void Admin_billing() throws IOException, AWTException, InterruptedException {
			WebDriver driver;
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Content2.properties");
			Properties p=new Properties();
			p.load(fis);
			String browser = p.getProperty("browser");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get(url);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
				driver.findElement(By.xpath("//button[text()='Login']")).click();
			
				Robot r = new Robot();
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//span[text()='POS']")).click();
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
					driver.findElement(By.xpath("//button[.='PROCEED TO PAYMENT']")).click();	
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
	}


