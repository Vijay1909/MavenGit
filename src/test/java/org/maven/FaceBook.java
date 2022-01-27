package org.maven;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClass {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	launchbrowser2("chrome");
launchUrl("https://www.facebook.com/");
implicitWait(20);
maximize();
LoginPage l=new LoginPage();
 sendkeys(l.getTxtUserName(), "vijay");
// driver.navigate().refresh();
 sendkeys(l.getTxtPassword(), "123876");
 click(l.getCreateClick());
// click(l.getBtnLogin());


	
}
}
