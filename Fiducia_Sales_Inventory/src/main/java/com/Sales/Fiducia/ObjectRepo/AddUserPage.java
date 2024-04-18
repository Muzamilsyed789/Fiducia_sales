package com.Sales.Fiducia.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Tyss_Fiducia_GenericUtility.WebDriverUtility;

public class AddUserPage {
@FindBy(xpath="//select[@name='empid']")
private WebElement addUserAcc;
@FindBy(xpath="//div[@class='form-group']//input[@name='username']")
private WebElement username;
@FindBy(xpath="//div[@class='form-group']//input[@placeholder='Password']")
private WebElement password;
@FindBy(xpath="//div[@class='modal fade show']/div/div//button[@type='submit']")
private WebElement svbtn;
@FindBy(xpath="//div[@aria-labelledby='userDropdown']/descendant::a[@data-toggle='modal']")
private WebElement lgbttn;
@FindBy(xpath="//div[@class='modal-footer']//a[text()='Logout']")
private WebElement finllogut;
@FindBy(xpath="//img[@class='img-profile rounded-circle']")
private WebElement imgbtn;

public AddUserPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public void selectcEmp(WebDriverUtility wbu,String text) {
	wbu.handleDropDown(addUserAcc,text );
}
public void setUserAcc(String user,String pass) {
	username.sendKeys("dualipa");
	password.sendKeys("12345");
	svbtn.click();
	imgbtn.click();
}
public void logout() {
	lgbttn.click();
}
public void finalLogout() {
	finllogut.click();
}
}