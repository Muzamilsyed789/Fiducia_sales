package com_Tyss_Fiducia_GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtility {
	public Actions performActions(WebDriver driver) {
		Actions act=new Actions(driver);
		return act;
	}
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
public void waitForPageLoad(WebDriver driver,int sec) {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
}
public void waitUntillEleToBeClickable(WebDriver driver,int sec,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void waitUntillToGetTitle(WebDriver driver,int sec,String title) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
	wait.until(ExpectedConditions.titleContains(title));
}
public void handleDropDown(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
public void handleDropDown(String value,WebElement element) {
	Select s=new Select(element);
	s.selectByValue(value);
}
public void handleDropDown(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
}

public void mouseHover(WebDriver driver,WebElement element) {

	performActions(driver).click(element).perform();
}
public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
	
	performActions(driver).dragAndDrop(src,dest).perform();
}
public void doubleClick(WebDriver driver) {
	performActions(driver).doubleClick().perform();
	
}
public void rightClick(WebDriver driver) {
	performActions(driver).contextClick().perform();
	
}
public void rightClick(WebDriver driver,WebElement element) {
	performActions(driver).contextClick(element).perform();
	
}
public void enterKeyPress(WebDriver driver) {
	performActions(driver).sendKeys(Keys.ENTER).perform();
	
}
public void SwitchToWindow(WebDriver driver,String ExpWind) {
	 Set<String> window = driver.getWindowHandles(); 
	Iterator<String> it= window.iterator();
	while(it.hasNext())
	{
		String win=it.next();
		String CurrTitle=driver.switchTo().window(win).getTitle();
				if(CurrTitle.contains(ExpWind)) {
					break;
				                                }
	}
}

	Robot robotObj()throws AWTException {
		Robot r=new Robot();
		return r;
}
	public void enterKey(WebDriver driver) throws AWTException {
		robotObj().keyRelease(KeyEvent.VK_ENTER);
}
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(WebDriver driver,String nameOrId) {
	driver.switchTo().frame(nameOrId);
}
public void switchToFrame(WebDriver driver,WebElement ele) {
	driver.switchTo().frame(ele);
}
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}

public void dismissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}

public void scrollBarActions(WebDriver driver,WebElement ele) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,8000","");
}
public void scrollActions(WebDriver driver,WebElement ele) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	int y=ele.getLocation().getY();
	j.executeScript("window.scrollBy(0,"+y+")",ele); 
}
public static String getscreenShot(WebDriver driver, String screenshotName)throws Throwable
{
	JavaUtility jutils=new JavaUtility();
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	   File src = ts.getScreenshotAs(OutputType.FILE);
	String path="./screenshot/"+screenshotName+" "+jutils.getSystemDateInFormate()+".png";
	File dest=new File(path);
	String scrpath=dest.getAbsolutePath();
    FileUtils.copyFile(src, dest);
    return scrpath;
}
public void scrollUpTillBottomOfPage(WebDriver driver) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
public void scrollUpTillElementToBeVisible(WebDriver driver,WebElement ele) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollInToView()",ele);

}
public void clickOnElement(WebDriver driver,WebElement ele) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()",ele);
}
public void jsUsingSendKeys(WebDriver driver,WebElement ele,String expData) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].value=arguments[1]",ele,expData);
}
public void scrollUPtillElementToBeVissible(WebDriver driver,WebElement ele) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Point loc = ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
}

}