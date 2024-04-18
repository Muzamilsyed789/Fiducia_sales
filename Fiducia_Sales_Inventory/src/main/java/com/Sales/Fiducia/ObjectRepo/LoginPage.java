package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="user")
private WebElement untbx;
@FindBy(name="password")
private WebElement pwtbx;
@FindBy(name="btnlogin")
private WebElement lgbtn;
@FindBy(name="user")
private WebElement untbx1;
@FindBy(name="password")
private WebElement pwtbx1;
@FindBy(name="btnlogin")
private WebElement lgbtn1;
public LoginPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void setLogin(String username,String password) {
	untbx.sendKeys(username);
	pwtbx.sendKeys(password);
	lgbtn.click();
}
public void setLoginUser(String username,String password) {
	untbx1.sendKeys(username);
	pwtbx1.sendKeys(password);
	lgbtn1.click();
}
}
