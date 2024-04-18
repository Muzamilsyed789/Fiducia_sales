package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//span[text()='Product']")
private WebElement prdbtn;
@FindBy(xpath="//span[text()='Accounts']")
private WebElement accmdl;
@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
private WebElement userAcc;
@FindBy(xpath="//img[@class='img-profile rounded-circle']")
private WebElement lgbtnimg;
@FindBy(xpath="(//a[@class='dropdown-item'])[1]")
private WebElement lgbtn;
public HomePage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void clickPrd() {
	prdbtn.click();
}
public void creatAcc() {
	accmdl.click();
}
public void createUser() {
	userAcc.click();
}
public void logout() {
	lgbtnimg.click();
	lgbtn.click();
}
}
