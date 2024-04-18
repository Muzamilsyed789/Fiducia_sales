package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentMultiTabs {
	@Test
	public void openingWindowstabs() {
		WebDriver driver=new ChromeDriver();
		/*driver.get("www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");*/
	
		for(int i=0;i>2;i++) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.flipkart.com");
		}
}
}