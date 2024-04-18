package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class ProductPage {
@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
private WebElement addbtn;
@FindBy(xpath="//select[@name='category']")
private WebElement selcat;
@FindBy(xpath="//select[@name='supplier']")
private WebElement selsup;
@FindBy(xpath="//table[@id='dataTable']/tbody/tr/td[text()='P00123']")
private WebElement srcprd;
@FindBy(xpath="//input[@type='search']")
private WebElement entrprd;
public ProductPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void addPrd() {
	addbtn.click();
}
public void selectcCategory(WebDriverUtility wbu,String text) {
	wbu.handleDropDown(selcat,text );
}
public void supplier(WebDriverUtility wbu1,String text) {
	wbu1.handleDropDown(selsup,text );
}
public void searchProduct() {
	srcprd.click();
}
public void enterProduct() {
	entrprd.sendKeys("P00123");
}
}