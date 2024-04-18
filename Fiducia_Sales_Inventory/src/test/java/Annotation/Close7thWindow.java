package Annotation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Close7thWindow {
	@ Test
	public void checkDemo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.google.com.com/");
		for(int i=0;i<9;i++) {
			driver.switchTo().newWindow(WindowType.WINDOW);
		}
		Set<String> win = driver.getWindowHandles();
		int count=0;
		String windowToClose ="";
		for(String handle:win) {
			count++;
			if(count==7) {
				windowToClose=handle;
				break;
			}
		}
		driver.switchTo().window(windowToClose);
		driver.close();
}
}