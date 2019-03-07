package winiumDemo.MyFlightWimium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class LoginFlight {
	
	//Mapeo pages
	
	WebDriver driver;	
	WebElement lblUserName;
	WebElement lblPasswd;
	WebElement btnOk;
	
	//Constructor
	public LoginFlight(WebDriver winium1) {
		
		this.driver=winium1;
	}
	//Meteodo
	public void login(String userName, String passwd) {
		lblUserName= driver.findElement(By.id("agentName"));
		lblUserName.sendKeys(userName);
		lblPasswd= driver.findElement(By.id("password"));
		lblPasswd.sendKeys(passwd);
		btnOk= driver.findElement(By.id("okButton"));
		btnOk.click();
	}
}
