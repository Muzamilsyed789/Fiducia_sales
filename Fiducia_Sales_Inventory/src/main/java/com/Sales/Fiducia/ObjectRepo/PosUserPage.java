package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class PosUserPage {

	@FindBy(xpath="//span[text()='POS']")
	private WebElement popg;
	@FindBy(xpath="//a[text()='Headset']")
	private WebElement prdCatg;
	@FindBy(xpath="//h6[text()='airdopes']/parent::div[@class='products']/descendant::input[@type='submit']")
	private WebElement addbtn;
	@FindBy(xpath="//select[@name='customer']")
	private WebElement selCUSO;
	@FindBy(xpath="//button[.='SUBMIT']")
	private WebElement Sbmt;
	@FindBy(xpath="//input[@id='txtNumber']")
	private WebElement cashbtn;
	@FindBy(xpath="//button[.='PROCEED TO PAYMENT']")
	private WebElement pytbtn;
	public PosUserPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void setUser() {
		popg.click();
		prdCatg.click();
		addbtn.click();
	}
	public void selectcCustomerByUser(WebDriverUtility wbu,String text) {
		wbu.handleDropDown(selCUSO,text );
	}
	public void setPOS1() {
		Sbmt.click();}
	public void setPOS2(String st) {
		cashbtn.sendKeys(st);
		pytbtn.click();
}
}