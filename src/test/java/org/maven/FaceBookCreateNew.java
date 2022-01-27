package org.maven;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookCreateNew extends BaseClass {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	launchbrowser2("chrome");
	launchUrl("https://www.facebook.com/");
	implicitWait(10);
	maximize();
	RegisterPage r=new RegisterPage();
	click(r.getCreateClick());
	sendkeys(r.getFirstname(), "vijay");
	sendkeys(r.getLastname(), "kumar");
	sendkeys(r.getMobilenumber(), "9940101015");
	sendkeys(r.getNewpassword(), "truevalue");
	selectByIndex(r.getDay(), 18);
	selectByIndex(r.getMonth(), 8);
	selectByValue(r.getYear(), "1987");
	click(r.getClickgender());
	click(r.getWebsubmit());
}
}
