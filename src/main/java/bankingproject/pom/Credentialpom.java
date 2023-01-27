package bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.bankingproject.base.BaseClass;

public class Credentialpom extends BaseClass{
	public  Credentialpom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@border='1']/tbody/tr[4]/td[2]")
	WebElement userId;
	
	@FindBy(xpath = "//table[@border='1']/tbody/tr[5]/td[2]")
	WebElement password;
	
	
	public void saveCredentials() {
		String userID=userId.getText();
		String passwordtext=password.getText();
		System.out.println(userID+""+passwordtext);
	}

}
