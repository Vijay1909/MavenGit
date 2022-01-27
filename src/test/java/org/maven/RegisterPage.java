package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {
	public static void main(String[] args) {
		
	}
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement CreateClick;
	
      
	@FindBy(name="firstname")
      private WebElement firstname;
      
      @FindBy(name="lastname")
      private WebElement lastname;
      
      @FindBy(xpath="(//input[@type='text'])[4]")
      private WebElement mobilenumber;
      
      @FindBy(xpath="(//input[@type='password'])[2]")
      private WebElement newpassword;
      
      @FindBy(id="day")
      private WebElement day;
      
      @FindBy(id="month")
      private WebElement month;
      
      @FindBy(id="year")
      private WebElement year;
      
      @FindBy(xpath="(//input[@type='radio'])[2]")
      private WebElement clickgender;
      
      @FindBy(name="websubmit")
      private WebElement websubmit;
      
	
      
public WebElement getWebsubmit() {
		return websubmit;
	}
public WebElement getClickgender() {
		return clickgender;
	}
public WebElement getYear() {
		return year;
	}
public WebElement getMonth() {
		return month;
	}
public WebElement getDay() {
		return day;
	}


	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getMobilenumber() {
		return mobilenumber;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	public WebElement getCreateClick() {
		return CreateClick;
	}
 
	}

