package Com.bankingproject.loginpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.bankingproject.base.BaseClass;
import Com.bankingproject.utility.Utility;
import bankingproject.pom.BankHomePagePom;
import bankingproject.pom.Credentialpom;
import bankingproject.pom.LoginPagePom;

public class BankHomePageTest extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}	
	
	/*
	
public String getEmailFromExcel() throws EncryptedDocumentException, IOException, InterruptedException,FileNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream(projectpath+"\\src\\test\\resources\\Excel\\bankingweb.xlsx");
		Sheet sh = WorkbookFactory.create(fileInputStream).getSheet("bank");
		String email = sh.getRow(0).getCell(0).getStringCellValue();
		
		return email;
	}

	*/
	
	
	
	
	
	
	
    @Test
	public void testGetCredential() throws InterruptedException, EncryptedDocumentException, IOException {
		LoginPagePom lognPagePom = new LoginPagePom();
		
		BankHomePagePom BankHomePagePom=lognPagePom.clickOnGetCredential();
		Thread.sleep(2000);
		Utility utility=new Utility();
	   String email=(String)utility.getSingleCellDataFromExcel(0,0,"bank");
		BankHomePagePom.setEmaiId(email);
		Thread.sleep(2000);
		
		Credentialpom credentialpom=BankHomePagePom.clickonsubmit();
		credentialpom.saveCredentials();
		
		
	}
}
