package bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.bankingproject.base.BaseClass;

public class BankHomePagePom extends BaseClass {

	public BankHomePagePom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailId;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement submitButton;


	public void setEmaiId(String email) {
		emailId.sendKeys(email);

	}

	public Credentialpom clickonsubmit() {
		submitButton.click();
		return new Credentialpom();
	}

}
