package Com.bankingproject.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.bankingproject.base.BaseClass;
import bankingproject.pom.LoginPagePom;

public class LoginPageTest extends BaseClass {

	
	LoginPagePom lognPagePom ;
	//WebDriver driver;
	
		@BeforeClass
		public void setUp() {
			launchWebsite();
		}
		@AfterClass
		public void tearDown() {
			driver.close();
			
		}
		
		
		
		@Test
		public void testTitle() {
			String pageTitle = driver.getTitle();
			if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page")) {
				System.out.println("we are on correct home page");
			}
			else {
				System.out.println("we are on wrong page");
			}
		}
			@Test
			public void testUrl() {
				String pageTitle = driver.getCurrentUrl();
				if(pageTitle.equalsIgnoreCase("https://demo.guru99.com/V1/index.php")) {
					System.out.println(" we are on correct page");
				}
				else {
					System.out.println("wrong page....");
				}
		}
	
	
	
			@Test
			public void clickOnLoginButton() throws InterruptedException {
				lognPagePom = new LoginPagePom();
				lognPagePom.clickOnLoginButton();
			}
			
			
			
}
