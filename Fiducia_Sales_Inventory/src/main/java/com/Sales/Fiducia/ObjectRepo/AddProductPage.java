package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
	@FindBy(xpath="//input[@placeholder='Product Code']")
	private WebElement prd;
@FindBy(xpath="//input[@placeholder='Name']")
private WebElement name;
@FindBy(xpath="//textarea[@placeholder='Description']")
private WebElement desc;
@FindBy(xpath="//input[@placeholder='Quantity']")
private WebElement qnty;
@FindBy(xpath="//input[@placeholder='On Hand']")
private WebElement onhnd;
@FindBy(xpath="//input[@placeholder='Price']")
private WebElement pric;
@FindBy(xpath="//input[@placeholder='Date Stock In']")
private WebElement datstoc;
@FindBy(xpath="//input[@type='date']/ancestor::div[@class='modal-body']/descendant::button[@type='submit']")
private WebElement clickSav;
public AddProductPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}


public void setPrd(String prd1,String name1 ,String dsc1,String qnty1,String onhnd1,String pric1,String dt) {
	prd.sendKeys(prd1);
	name.sendKeys(name1);
	desc.sendKeys(dsc1);
	qnty.sendKeys(qnty1);
	onhnd.sendKeys(onhnd1);
	pric.sendKeys(pric1);
	datstoc.click();
	datstoc.sendKeys(dt);
	clickSav.click();

}
/*public void clickSave() {
	clickSav.click();
}*/
}
