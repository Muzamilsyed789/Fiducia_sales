package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
@FindBy(xpath="//span[text()='Inventory']")
private WebElement invtmdl;
@FindBy(xpath="//input[@type='search']")
private WebElement srcmdl;
@FindBy(xpath="//input[@type='search']")
private WebElement prdcod;
@FindBy(xpath="//td[text()='airdopes']/ancestor::tr[@role='row']/descendant::td[@align='right']")
private WebElement viewbtn;
@FindBy(xpath="(//a[@class='btn btn-warning bg-gradient-warning'])[1]")
private WebElement edtbtn;
@FindBy(xpath="//input[@placeholder='Quantity']")
private WebElement qntyclick;
@FindBy(xpath="//input[@placeholder='Quantity']")
private WebElement qntyent;
@FindBy(xpath="//input[@placeholder='On Hand']")
private WebElement onhndclick;
@FindBy(xpath="//input[@placeholder='On Hand']")
private WebElement onhndent;
@FindBy(xpath="//i[@class='fa fa-edit fa-fw']")
private WebElement updbtn;
public InventoryPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}

public void setInventory(String prdc ,String qty  ,String Ohnd) {
	invtmdl.click();
	srcmdl.click();
	prdcod.sendKeys(prdc);
	viewbtn.click();
	edtbtn.click();
	qntyclick.click();
	qntyent.sendKeys(qty);
	onhndclick.click();
	onhndent.sendKeys(Ohnd);
	updbtn.click();
}

}
