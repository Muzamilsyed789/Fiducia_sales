package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class PosPage {
@FindBy(xpath="//span[text()='POS']")
private WebElement popg;
@FindBy(xpath="//a[text()='Headset']")
private WebElement prdCatg;
@FindBy(xpath="//h6[.='airdopes']/parent::div//descendant::input[@class='btn btn-info']")
private WebElement addBtn;
@FindBy(xpath="//select[@name='customer']")
private WebElement selCUSO;
@FindBy(xpath="//button[.='SUBMIT']")
private WebElement Sbmt;
@FindBy(xpath="//input[@id='txtNumber']")
private WebElement cashbtn;
@FindBy(xpath="//button[.='PROCEED TO PAYMENT']")
private WebElement pytbtn;
public PosPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void setPOS() {
	popg.click();
	prdCatg.click();
	addBtn.click();
}
public void selectcCustomer(WebDriverUtility wbu,String text) {
	wbu.handleDropDown(selCUSO,text );
}
public void setPOS1() {
	Sbmt.click();}
public void setPOS2(String st) {
	cashbtn.sendKeys(st);
	pytbtn.click();
}
}
